package models;
import domain.IStatement;

/**
 * Created by Andra on 10/25/2015.
 */
public class ProgramState {
    private IList Out;
    private Dictionary SymTable;
    private IStack ExeStack;
  //  public IStatement s;

    public ProgramState(){}
    public ProgramState(IList out, Dictionary st,IStack es)
    {
        Out=out;
        SymTable=st;
        ExeStack=es;

    }
    public IStack getStack(){return ExeStack;}
    public Dictionary getSymTable(){return SymTable;}
    public IList getOut(){return Out;}
    public String ToString(){return ExeStack.toString()+"\n"+SymTable.toString()+"\n"+Out.toString()+"\n";}




}
