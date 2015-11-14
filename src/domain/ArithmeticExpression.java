package domain;

/**
 * Created by Andra on 10/24/2015.
 */
import models.Dictionary;
public class ArithmeticExpression extends IExpression{
    public IExpression Expression1;
    public IExpression Expression2;
    public String Operator;

    public ArithmeticExpression(){}
    public ArithmeticExpression(IExpression ex1,IExpression ex2,String op){
        this.Expression1=ex1;
        this.Expression2=ex2;
        this.Operator=op;
    }

    public int Eval(Dictionary symTable){
        int left=this.Expression1.Eval(symTable);
        int right=this.Expression2.Eval(symTable);
        String oper = this.Operator;

        if(oper.equals("*"))
            return left*right;
        if(oper.equals("+"))
            return left+right;
        if(oper.equals("-"))
            return left-right;
        try{
            if(oper.equals("/"))
                return left/right;
        }catch (Exception e)
        {
            System.out.println("You can't divide by 0!");
            return 0;
        }
        return 0;

    }
    public String ToString(){
        String result="";
        result=result+this.Expression1.ToString()+this.Operator+this.Expression2.ToString();
        return result;
    }
}
