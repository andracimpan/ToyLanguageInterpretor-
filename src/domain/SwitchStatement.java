package domain;

import java.beans.Expression;

/**
 * Created by Andra on 11/10/2015.
 */
public class SwitchStatement implements IStatement {
   public String varname;
   public IExpression ex1;
   public IExpression ex2;
   public IStatement i;
   public IStatement i2;
   public IStatement i3;
   public SwitchStatement(){}
   public SwitchStatement(String v,IExpression e,IStatement is,IExpression e1,IStatement is2,IStatement is3){
        this.varname = v;
        this.ex1=e;
        this.ex2=e ;
        this.i=is;
        this.i2=is2;
        this.i3=is3;
    }
    public String ToString(){
        return "Switch(" + varname + ") case("+ex1.toString() + ") :"+i.toString()+ " case("+ex2.toString() + "):"
                + i2.toString() + " default: "+i3.toString() + " ";
    }

}
