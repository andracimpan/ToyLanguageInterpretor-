package models;

/**
 * Created by Andra on 10/19/2015.
 */
public class ArrayDictionary implements Dictionary {

    private Pair[] elements;
    private int nrElements;

    public ArrayDictionary(){
        elements = new Pair[15];
        nrElements=0;
    }
    public int size(){return nrElements;}
    public void add(String k, int v){
        if(nrElements == elements.length){
            System.out.println("You cannot add any more elemens because the dictionary is full!\n");
            return;

        }
        for(int i=0; i<nrElements;i++)
            if(elements[i].getKey()==k){
                elements[i].setValue(v);
                return;
            }
        elements[nrElements++] = new Pair(k,v);
    }



    private void resize(){
        Pair[] tmp = new Pair[2*elements.length];
        for(int i=0; i<elements.length; i++)
            tmp[i] =elements[i];
        elements=tmp;
    }

    public int lookUp(String k){
        if(nrElements==0)
            return -1;
        for(int i=0; i<elements.length; i++)
            if(k == elements[i].getKey())
                return elements[i].getValue();

        return -1;
    }
    public String ToString(){
        String result="SymTabe={";
        for(int i = 0;i < nrElements;i++)
            result= result+elements[i].getKey()+"= "+elements[i].getValue()+'\n';
        return result+" }";
    }

}
