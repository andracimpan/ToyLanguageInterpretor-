package tests;
import models.ArrayList;
import models.IList;

/**
 * Created by Andra on 10/20/2015.
 */
public class TestList {
    public static void main(String[] args){
        System.out.println("Test IList");
        IList l =new ArrayList();
        l.add(9);
        l.add("password");
        l.add(13.3);
        for(int i=0; i<l.getLength();i++)
            System.out.println(l.getElement(i));
}
}
