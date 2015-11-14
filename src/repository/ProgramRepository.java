package repository;

import models.ProgramState;

/**
 * Created by Andra on 10/25/2015.
 */
public class ProgramRepository implements IProgramRepository {
   private ProgramState[] elements;
    private int nrElements;
    public ProgramRepository(int i){
        elements = new ProgramState[i];
        nrElements=0;
    }

    public int size(){return nrElements;}
    public void add(ProgramState ps){
        if(nrElements == elements.length){
            System.out.println("You cannot add any more elemens because the list is full!\n");
            return;
        }
        elements[nrElements++]=ps;
    }


    public int getLength(){
        return nrElements;
    }
    public ProgramState getElement(int index){
        if(index >=0 && index < nrElements)
            return elements[index];
        else {
            System.out.println("The index is not valid!\n");
            return null;
        }

    }

    public ProgramState getCurrentProgram(){
        return elements[nrElements-1];
    }
    public void saveProgramState(ProgramState ps){
        elements[nrElements]=ps;
    }
}


