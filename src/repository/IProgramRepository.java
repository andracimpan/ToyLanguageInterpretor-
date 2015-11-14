package repository;

import models.ProgramState;

/**
 * Created by Andra on 10/25/2015.
 */
public interface IProgramRepository {
    public void add( ProgramState ps);
    public int getLength();
    public int size();
    public ProgramState getElement(int index);
    public ProgramState getCurrentProgram();
    public void saveProgramState(ProgramState ps);
}
