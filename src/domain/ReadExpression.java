package domain;

import models.Dictionary;

import java.util.Scanner;

/**
 * Created by Andra on 11/10/2015.
 */
public class ReadExpression extends IExpression{
    int n;
    public ReadExpression(){}
    public int Eval(Dictionary var1)
        {
            try
            {
                System.out.println("Introduce an integer : ");
                Scanner in= new Scanner(System.in);
                n=in.nextInt();
                return n;
            }
            catch (Exception e){
                System.out.println("Enter only numbers!");
            }
            return 0;
        }
    public String ToString(){
        String rez=" ";
        rez = rez+"read()";
        return rez;
    }

}
