/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

package lang.visitor;

//import lang.semanticanalysis.STyInt;
import lang.semanticanalysis.*;
import lang.ast.*;
import lang.ast.expr.*;
import lang.ast.cmd.*;
//import lang.ast.types.*;
import lang.ast.decls.*;
import lang.ast.NodeVisitor;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

public class TypeCheckVisitor extends NodeVisitor {
    //Criação dos tipos básicos de lang
    private STyInt tyint = STyInt.newSTyInt();
    private STyFloat tyfloat = STyFloat.newSTyFloat();
    private STyChar tychar = STyChar.newSTyChar();
    private STyBool tybool = STyBool.newSTyBool();
    private STyErr tyerr = STyErr.newSTyErr();

    //Variável usada para guardar todos os erros
    private ArrayList<String> logError;

    //TyEnv é uma HashTable
    private TyEnv<LocalEnv<SType>> env;
    private LocalEnv<SType> temp;

    //Pilha de tipos para o cálculo de tipos das expressões
    private Stack<SType> stk;

    //Verifica de houve retorno de função
    private boolean retChk;

    public TypeCheckVisitor(){
        stk = new Stack<SType>();
        env = new TyEnv<LocalEnv<SType>>();
        logError = new ArrayList<String>();
    }

    //Retorna o número de erros encontrados pelo TypeCheck
    public int getNumErrors(){
        return logError.size();
    }

    public void printErrors(){
        for (String s : logError){
            System.out.println(s);
        }
    }

    public void visit(Program p){
        for (Func f : p.getFuncs()){
            STyFun ty;
            //o vetor de tipos tem num_params + 1 pois também
            //inclui o tipo de retorno da função
            SType[] xs = new SType[f.getParams().length + 1];
            //Passa pelos parâmetros da função
            for (int i = 0; i < f.getParams().length; i++){
                f.getParams()[i].getTipo().accept(this);
                xs[i] = stk.pop();
            }
            //coloca na última posição do vetor o tipo de retorno
            f.getTipo().accept(this);
            xs[f.getParams().length] = stk.pop();
            ty = new STyFun(xs);
            //
            env.set(f.getID(), new LocalEnv<SType>(f.getID(), ty));
        }
        for (Func f : p.getFuncs()){
            f.accept(this);
        }
    }

    public  void visit(Func d){ 
        retChk = false;
        temp = env.get(d.getParams());
        for(Param p : d.getParams()){
            p.getTipo().accept(this);
            temp.set(p.getID(), stk.pop());
        }
        f.getBody().accept(this);
    }
    
    public  void visit(TyBind d){ }
    public  void visit(Data d){   }
    public  void visit(Field d){  }
    

    // Aritmética, lógica e comparações.
    private void typeArithmeticBinOp(Node n, String opName){
        SType tyr = stk.pop();
        SType tyl = stk.pop();

        if ((tyr.match(tyint))){
            if (tyl.match(tyint) || tyl.match(tyfloat)){
                stk.push(tyl);
            }
            else{
                logError.add(n.getLine() + ", " + n.getColumn() + ": Operador" + opName
                + "inválido para tipos (" + tyl.toString() + ", " + tyr.toString() + ")");
                stk.push(tyerr);
            }
        }
        else if(tyr.match(tyfloat)){

            if(tyl.match(tyint) || tyl.match(tyfloat)){
                stk.push(tyl);
            }
            else{
                logError.add(n.getLine() + ", " + n.getColumn() + ": Operador" + opName
                + "inválido para tipos (" + tyl.toString() + ", " + tyr.toString() + ")");
                stk.push(tyerr);
            }
        }
        else{
            logError.add(n.getLine() + ", " + n.getColumn() + ": Operador" + opName
            + "inválido para tipos (" + tyl.toString() + ", " + tyr.toString() + ")");
            stk.push(tyerr);
        }
    }

    public  void visit(Add e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        typeArithmeticBinOp(e, "+");
    }

    public  void visit(Sub e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        typeArithmeticBinOp(e, "-");
    }

    public  void visit(Mult e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        typeArithmeticBinOp(e, "*");
    }

    public  void visit(Div e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        typeArithmeticBinOp(e, "/");
    }

    public  void visit(Mod e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        //Operação válida apenas para números inteiros
        if(tyr.match(tyint) && tyl.match(tyint)){
            stk.push(tyint);
        }
        else{
            logError.add(e.getLine() + ", " + e.getColumn() + ": Operador % inválido para tipos ("
            + tyl.toString() + ", " + tyr.toString() + ")");
            stk.push(tyerr);
        }
    }

    public  void visit(And e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        if (tyr.match(tybool) && tyl.match(tybool)){
            stk.push(tybool);
        }
        else{
            logError.add(e.getLine() + ", " + e.getColumn() + ": Operador and inválido para tipos ("
            + tyl.toString() + ", " + tyr.toString() + ")");
            stk.push(tyerr);
        }
    }

    public  void visit(Not e){
        e.getExpr().accept(this);
        SType tyr = stk.pop();
        if (tyr.match(tybool)){
            stk.push(tybool);
        }
        else{
            logError.add(e.getLine() + ", " + e.getColumn() + ": Operador not inválido para tipo "
            + tyr.toString());
            stk.push(tyerr);
        }

    }


    public  void visit(Eq e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        if ( (tyr.match(tyint) || tyl.match(tybool)) && (tyl.match(tyint) || tyl.match(tybool))){
            stk.push(tybool);
        }
        else if (tyr.match(tychar) && tyl.match(tychar)){
            stk.push(tychar);
        }
        else{
            logError.add(e.getLine() + ", " + e.getColumn() + ": Operador equals inválido para tipos ("
            + tyl.toString() + ", " + tyr.toString() + ")");
            stk.push(tyerr);
        }
    }

    public  void visit(Lt e){
        e.getLeft().accept(this);
        e.getRight().accept(this);
        SType tyr = stk.pop();
        SType tyl = stk.pop();
        if ( (tyr.match(tyint) || tyl.match(tybool)) && (tyl.match(tyint) || tyl.match(tybool))){
            stk.push(tybool);
        }
        else{
            logError.add(e.getLine() + ", " + e.getColumn() + ": Operador < inválido para tipos ("
            + tyl.toString() + ", " + tyr.toString() + ")");
            stk.push(tyerr);
        }
    }


    public  void visit(Call e){
        LocalEnv<SType> le = env.get(e.getName());
        if(le != null){
            STyFun tf = (STyFun)le.getFuncType();
            if(e.getArgs().length == tf.getTypes().length - 1){
                int k = 0;
                boolean r = true;
                for(Expr x : e.getArgs()){
                    x.accept(this);
                    if(!tf.getTypes()[k].match(stk.pop())){
                        logError.add(x.getLine() + ", " + x.getColumn() + ": " + (k+1) +
                        " argumento incompatível com o parâmetro de " + e.getName());
                        stk.push(tyerr);
                    }
                    k++;
                }
                stk.push(tf.getTypes()[tf.getTypes().length - 1]);
            }

            else{
                logError.add(x.getLine() + ", " + x.getColumn() + ": Número incompatível de argumentos e parâmetros na chamada da função " + e.getName());
                stk.push(tyerr);
            }

        }
    }

    public  void visit(Location c);
    public  void visit(Index idx);

    //Simplesmente adiciona o tipo na pilha
    public  void visit(NullLit e){ stk.push(tyerr); }
    public  void visit(BoolLit e){ stk.push(tybool); }
    public  void visit(IntLit e){  stk.push(tyint); }
    public  void visit(CharLit e){ stk.push(tychar); }
    public  void visit(FloatLit e){ stk.push(tyfloat); }
    
    
    public  void visit(Instanciate e){
        //verifica se a já foi instanciada (!= null)
        if(temp.get(e.getID().getName()) != null){
            logError.add(e.getLine() + ", " + e.getColumn() + ": Redefinição da variável"
            + e.getID());
        }
        else{
            e.getSize().accept(this);
            //verifica se o tamanho do vetor é inteiro
            if(stk.pop().match(tyint)){
                e.getTipo().accept(this);
                temp.set(e.getID().getName(), new STyArr(stk.pop()));
            }
        }

    } 

    public  void visit(Var e){
        SType t = temp.get(e.getName());
        if(t != null){
            for (Expr x : e.getIdx()){
                if(t instanceof STyArr){
                    t = ((STyArr) t).getArg();
                }
                else{
                    t = tyerr;
                }
            }
            if (t == tyerr){
                logError.add(e.getLine() + ", " + e.getColumn() +
                ": Atribuição com tipos incompatíveis");
            }
            stk.push(t);
        }
        else{
            logError.add(e.getLine() + ", " + e.getColumn() + ": Variável " + e.getName() +
            " não declarada");
            stk.push(tyerr);
        }
    }

    // Comandos
    public  void visit(Attr c){
        if(temp.get(c.getID().getName()) == null && (c.getID().getIdx() == null
        || c.getID().getIdx().length == 0) ){
            c.getExpr().accept(this);
            temp.set(c.getID().getName(), stk.pop());
        }
        else{
            c.getID().accept(this);
            c.getExpr().accept(this);
            if(!stk.pop().match(stk.pop())){
                logError.add(c.getLine() + ", " + c.getColumn()
                + ": Atribuição ilegal para variável " + c.getName());
            }
        }
    }
    public  void visit(Iterate c);
    
    public  void visit(While c){
        c.getTeste().accept(this);
        if(stk.pop().match(tybool)){
            c.getBody().accept(this);
        }
        else{
            logError.add(c.getLine() + ", " + c.getColumn() + ": Expressão de teste inválida "
             + c.getName());
        }
    }

    public  void visit(If c){
        boolean rt, re;
        re = false;
        c.getTeste().accept(this);
        if(stk.pop().match(tybool)){
            retChk = false;
            c.getThen().accept(this);
            re = retChk;
            if(c.getElse() != null){
                retChk = false;
                c.getElse().accept(this);
                re = retChk;
            }
            retChk = rt && re;
        }        
        else {
            logError.add(c.getLine() + ", " + c.getColumn()
            + " : Expressão de teste inválida no comando if");
        }
    }

    public  void visit(Seq c){
        if(retMode){ return; }
        c.getLeft().accept(this);
        if(retMode){ return; }
        c.getRight().accept(this);
    }
    
    public  void visit(CallCmd c);
    
    public  void visit(Print c){
        c.getExpr().accept(this);
        stk.pop();
    }
    public  void visit(Read c){
    }
    
    public  void visit(Return c){
        c.getExpr().accept(this);
        if(temp.getFuncType() instanceof SType){
            SType[] t = ((SType)temp.getFuncType()).getTypes();

        }
        else{
            stk.pop().match(temp.getFuncType());
        }
        retChk = true;
    }


    //Não é preciso fazer nada
    //public  void visit(STyVoid ty){ }
    public  void visit(STyInt ty){ }
    public  void visit(STyFloat ty){ }
    public  void visit(STyChar ty){ }
    public  void visit(STyBool ty){ }
    //public  void visit(STyID ty){ }
    //public  void visit(STyArr ty){ }


}

/*
olhar if (= true) e mod (SType tyr = stk.pop()) 
*/

/*
// Root of the tree !
public abstract void visit(Program d);

// Declarations
public abstract void visit(Func d);
public abstract void visit(TyBind d);
public abstract void visit(Data d);
public abstract void visit(Field d);

// Aritmética, lógica e comparações.
public abstract void visit(Add e);
public abstract void visit(Sub e);
public abstract void visit(Mult e);
public abstract void visit(Div e);
public abstract void visit(Mod e);
public abstract void visit(And e);
public abstract void visit(Not e);
public abstract void visit(Eq e);
public abstract void visit(Lt e);
public abstract void visit(Call e);
public abstract void visit(Location c);
public abstract void visit(Index idx);
public abstract void visit(NullLit e);
public abstract void visit(BoolLit e);
public abstract void visit(IntLit e);
public abstract void visit(CharLit e);
public abstract void visit(FloatLit e);
public abstract void visit(Instanciate e);  
public abstract void visit(Var e);  

// Comandos
public abstract void visit(Attr c);
public abstract void visit(Iterate c);
public abstract void visit(While c);
public abstract void visit(If c);
public abstract void visit(Seq c);
public abstract void visit(CallCmd c);
public abstract void visit(Print c);
public abstract void visit(Read c);
public abstract void visit(Return c);

// Types 
public abstract void visit(TyVoid ty);
public abstract void visit(TyInt ty);
public abstract void visit(TyFloat ty);
public abstract void visit(TyChar ty);
public abstract void visit(TyBool ty);
public abstract void visit(TyID ty);
public abstract void visit(TyArr ty);
*/




