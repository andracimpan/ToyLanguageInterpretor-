package models;

/**
 * Created by Andra on 10/19/2015.
 */
public class Pair {
   String key;
   int value;

    public Pair(String k, int v){
        key=k;
        value=v;
    }
    public String getKey(){
        return  key;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int v){
        this.value=v;
    }

}
