package domain;

/**
 * Created by Andra on 10/24/2015.
 */

import domain.IStatement;
import domain.IExpression;
public class PrintStatement implements IStatement {

    public IExpression Expression;
    public PrintStatement(){}
    public PrintStatement(IExpression ex){
        this.Expression =ex;
    }
    public IExpression getExpression(){return Expression;}
    public String ToString(){
        String result="Print("+ this.Expression.ToString()+")";
        return result;
    }

}

