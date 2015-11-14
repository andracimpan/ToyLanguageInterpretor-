package models;

/**
 * Created by Andra on 10/19/2015.
 */
public interface Dictionary {
    public void add(String key, int value);
    public int lookUp(String key);
    public int size();
    public String ToString();

}

