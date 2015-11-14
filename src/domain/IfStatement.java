package domain;

/**
 * Created by Andra on 10/24/2015.
 */
import domain.IExpression;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.beans.Statement;

public class IfStatement implements IStatement {
    public IExpression Expression;
    public IStatement StatementThen;
    public IStatement StatementElse;
    public SkipStatement StatementSkip;

    public IfStatement(){}
    public IfStatement(IExpression ex, IStatement stThen){
        this.Expression=ex;
        this.StatementThen=stThen;
        this.StatementElse=null;
    }

    public IfStatement(IExpression ex, IStatement stThen,IStatement stElse){
        this.Expression=ex;
        this.StatementThen=stThen;
        this.StatementElse=stElse;
    }

    public void set(SkipStatement ex){ this.StatementElse=ex; }

    public String ToString(){
        String result="";
        if(this.StatementElse == null)
            result = result+" If "+this.Expression.ToString()+" Then "+this.StatementThen.ToString();
        else
            result = result+" If "+this.Expression.ToString()+" Then "+this.StatementThen.ToString()+" Else "+this.StatementElse.ToString();
        return result;
    }

}
