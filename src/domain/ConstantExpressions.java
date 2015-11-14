package domain;

/**
 * Created by Andra on 10/24/2015.
 */
import models.Dictionary;

public class ConstantExpressions extends IExpression {
  public int Number;
    public ConstantExpressions(){}
    public ConstantExpressions(int nr){
        this.Number=nr;
    }
    public int Eval(Dictionary symTable){
        return this.Number;
    }
    public String ToString(){
        return String.valueOf(this.Number);
    }
}
