package lang.visitor;

import ast.*;
import semanticanalysis.*;

import java.util.Stack;
import java.util.ArrayList;

public class TypeCheckVisitor() extends Visitor {
    //Criação dos tipos básicos de lang
    private STyInt tyint = STyInt.newSTyInt();
    private STyFloat tyfloat = STyFloat.newSTyFloat();
    private STyChar tychar = STyChar.newSTyChar();
    private STyBool tybool = STyBoo.newSTyBool();
    private STyErr tyerr = STyErr.newSTyErr();

    //Variável usada para guardar todos os erros
    private ArrayList<String> logError;


}