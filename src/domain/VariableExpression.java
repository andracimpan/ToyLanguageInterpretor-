package domain;

/**
 * Created by Andra on 10/24/2015.
 */
import models.Dictionary;
public class VariableExpression extends IExpression {
    public String Variable;
    public VariableExpression(){}
    public VariableExpression(String var){
        this.Variable=var;
    }

    public int Eval(Dictionary symTable)
    {
        try {
            return symTable.lookUp(this.Variable);
            }
        catch (Exception var3) {
            System.out.println("You should declare te variable first!");
            return 0;
        }
    }
    public String ToString(){return  this.Variable;}
}
