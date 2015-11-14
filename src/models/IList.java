package models;

/**
 * Created by Andra on 10/19/2015.
 */
public interface IList {
    public void add(Object e);
    public int getLength();
    public int size();
    public Object getElement(int index);
    public String ToString();

}
