package models;

/**
 * Created by Andra on 10/19/2015.
 */
public class ArrayList implements IList {
    private Object[] elements;
    private int nrElements;

    public ArrayList(){
        elements = new Object[15];
        nrElements=0;
    }
    public int size(){return nrElements;}
    public void add(Object e){
        if(nrElements == elements.length){
            System.out.println("You cannot add any more elemens because the list is full!\n");
            return;
        }
        elements[nrElements++]=e;
    }

    private void resize(){
        Object[] tmp = new Object[2*elements.length];
        for(int i =0; i<elements.length;i++)
            tmp[i] = elements[i];
        elements=tmp;
    }
    public int getLength(){
    return nrElements;
}
    public Object getElement(int index){
    if(index >=0 && index < nrElements)
        return elements[index];
        else {
        System.out.println("The index is not valid!\n");
        return null;
    }

    }
    public String ToString(){
        String result = "List = { ";
        for(int i = 0; i < nrElements;i++) {
            result = result + elements[i].toString() + " ";
        }
        result = result + " } \n";
        return result;
    }
}
