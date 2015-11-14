package domain;

/**
 * Created by Andra on 11/10/2015.
 */
import models.Dictionary;
public class LogicalExpression extends  IExpression {
    public IExpression Expression1;
    public IExpression Expression2;
    public String Operator;

    public LogicalExpression(){}
    public LogicalExpression( IExpression ex1, IExpression ex2, String op){
        this.Expression1 = ex1;
        this.Expression2 = ex2;
        this.Operator = op;
    }
    public int Eval(Dictionary symTable){
        int left=this.Expression1.Eval(symTable);
        int right=this.Expression2.Eval(symTable);
        String oper = this.Operator;

        if(oper=="|")
           if( (left >0 ) || (right>0)) return 1;
           else return 0;
        if(oper=="&")
            if( (left >0 ) &&  (right>0)) return 1;
            else return 0;
        if(oper=="!")
            if(left == 0 ) return 1;
            else return 0;

        return 0;

    }
    public String ToString(){
        String result="";

        if( this.Operator =="|" )
            result=result+this.Expression1.ToString()+" || "+this.Expression2.ToString();
        if( this.Operator =="&" )
            result=result+this.Expression1.ToString()+" && "+this.Expression2.ToString();
        if( this.Operator =="!" )
            result=result+" != "+this.Expression1.ToString();



        return result;
    }



}
