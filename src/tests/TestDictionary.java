package tests;
import models.Dictionary;
import models.ArrayDictionary;
/**
 * Created by Andra on 10/20/2015.
 */
public class TestDictionary {
    public static void main(String[] args){
        System.out.println("Test Dictionary\n");
        Dictionary d=new ArrayDictionary();
        d.add("first",1);
        System.out.println(d.lookUp("first"));
        d.add("second",2);
        System.out.println(d.lookUp("second"));
        d.add("second",7);
        System.out.println(d.lookUp("second"));
}}

