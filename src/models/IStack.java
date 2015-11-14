package models;



/**
 * Created by Andra on 10/19/2015.
 */
import domain.IStatement;
import domain.IfStatement;

public interface IStack {
    public void push(IStatement e);
    public IStatement pop();
    public boolean isEmpty();
    public IStatement peek();
    public int size();
    public IStatement elementAt(int i);
    public String ToString();

}
