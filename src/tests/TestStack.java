package tests;
import models.IStack;
import models.ArrayStack;
/**
 * Created by Andra on 10/20/2015.
 */
public class TestStack {
    public static void main(String[] args) {

        System.out.println("Test IStack .\n");
        IStack s=new ArrayStack();
        //s.push("first");
        //s.push(198);
        //s.push(18.89);
        while(!s.isEmpty())
            System.out.println(s.pop());
    }
}
