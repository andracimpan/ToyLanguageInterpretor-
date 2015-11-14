package domain;

/**
 * Created by Andra on 11/9/2015.
 */
public class WhileStatement implements IStatement {
    public IExpression Expression;
    public IStatement Statement1;



    public WhileStatement(){}
    public WhileStatement(IExpression ex, IStatement st){
        this.Expression=ex;
        this.Statement1=st;

    }

       public String ToString(){
        String result="";
                    result = result+" (While( "+this.Expression.ToString()+" ) "+this.Statement1.ToString()+" ;";
        return result;
    }

}
