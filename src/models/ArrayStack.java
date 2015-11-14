package models;

import domain.IStatement;

/**
 * Created by Andra on 10/19/2015.
 */
import domain.IStatement;
public class ArrayStack implements IStack {
    private IStatement[] elements;
    private int nrElements;

    public ArrayStack(){
        elements=new IStatement[15];
        nrElements=0;
    }
    public int size(){return nrElements;}

    public void push(IStatement e){
        if(nrElements==elements.length){
            System.out.println("You cannot add any more elemens because the stack is full!\n");
            return;
        }
        elements[nrElements++]=e;

    }
    public IStatement elementAt(int i){
        if(i > nrElements){
            System.out.println("There is no such element in the stack!\n");
            return null;
        }
        return elements[i];
        }

    public IStatement pop(){
        if(isEmpty())
            return null;
        return elements[--nrElements];

    }
    public void resize(){
        Object[] tmp = new Object[2*elements.length];
        for(int i=0; i<elements.length;i++)
            tmp[i]=elements[i];
    }
    public boolean isEmpty(){
        return(nrElements == 0);
    }
    public IStatement peek(){
        if(!isEmpty())
            return elements[nrElements-1];
        return null;
    }
    public String ToString(){
        String result="Stack={ ";
        for(int i=0;i<nrElements;i++)
            result=result+elements[i].ToString()+"|";
        result =result+" }";
        return result;
    }

}

