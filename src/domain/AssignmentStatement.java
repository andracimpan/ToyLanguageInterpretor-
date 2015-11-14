package domain;

/**
 * Created by Andra on 10/24/2015.
 */
import domain.IStatement;

import java.beans.Expression;

public class AssignmentStatement implements IStatement {

    public String Id;
    public IExpression Expression;
    public AssignmentStatement(){}

    public AssignmentStatement(String id, IExpression ex){
        this.Id=id;
        this.Expression=ex;
    }

    public String ToString(){
        String result="";
        result=result+this.Id+"="+this.Expression.ToString();
        return result;
    }
}
