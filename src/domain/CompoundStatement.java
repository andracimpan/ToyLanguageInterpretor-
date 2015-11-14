package domain;

/**
 * Created by Andra on 10/24/2015.
 */
public class CompoundStatement implements IStatement {
    public IStatement Statement1;
    public IStatement Statement2;

    public CompoundStatement(){}
    public CompoundStatement(IStatement st1, IStatement st2){
        this.Statement1 = st1;
        this.Statement2=st2;
        }
    public String ToString(){
        String result="";
        result=result+this.Statement1.ToString()+";"+this.Statement2.ToString();
        return result;
    }

}
