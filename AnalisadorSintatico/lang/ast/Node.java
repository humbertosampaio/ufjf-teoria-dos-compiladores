package lang.ast;

/**
 * @author Humberto Sampaio - 201635012
 * @author Luís Henrique Simplício Ribeiro - 201635037
 */

public class Node extends SuperNode{
    private int line;
    private int column;

    public Node(){
        super();
    }

    public Node(int line, int column){
        super();
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine(){
        return this.line;
    }

    @Override
    public int getColumn(){
        return this.column;
    }
}


