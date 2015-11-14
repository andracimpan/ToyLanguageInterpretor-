package view;

import controller.Controller;
import domain.*;
import models.*;
import models.IStack;
import models.ArrayStack;
import domain.IStatement;
import domain.RelationshipExpression;
import repository.IProgramRepository;
import repository.ProgramRepository;

/**
 * Created by Andra on 10/26/2015.
 */
public class View {
    public static void main(String args[]){
        IList list = new ArrayList();
        Dictionary dict=new ArrayDictionary();
        IStack stk=new ArrayStack();



      // IStatement stm2=new CompoundStatement(new AssignmentStatement("a",new RelationshipExpression(new ConstantExpressions(2)
        //       ,new ConstantExpressions(2),">=")),new CompoundStatement(new IfStatement(new VariableExpression("a"),new AssignmentStatement("v",new ConstantExpressions(2))),new PrintStatement(new VariableExpression("v"))));

        //IStatement stm2 =new CompoundStatement(new AssignmentStatement("v",new ConstantExpressions(2)), new WhileStatement(new ArithmeticExpression( new VariableExpression("v"),new ConstantExpressions(1),"-"),new PrintStatement(new VariableExpression("v"))));
        IStatement i = new CompoundStatement(new AssignmentStatement ("v", new ReadExpression()),new WhileStatement(new ArithmeticExpression(new VariableExpression("v"), new ConstantExpressions(3),"-")
               ,new CompoundStatement(new PrintStatement(new VariableExpression("v")), new AssignmentStatement("v", new ArithmeticExpression(new VariableExpression("v"), new ConstantExpressions(1), "-")))));

        // logical expression
        IStatement stm3=new CompoundStatement(new AssignmentStatement("a",new LogicalExpression(new ConstantExpressions(2)
               ,new ConstantExpressions(0),"|")),new CompoundStatement(new IfStatement(new VariableExpression("a"),new AssignmentStatement("v",new ConstantExpressions(2))),new PrintStatement(new VariableExpression("v"))));
        //read expression
       IStatement stm2= new AssignmentStatement("a",new ReadExpression());

        //switch statement
       // IStatement stm2 = new SwitchStatement();
        stk.push(i);



        ProgramState p = new ProgramState(list,dict,stk);
        IProgramRepository repo = new ProgramRepository(30);

        repo.add(p);
        Controller c = new Controller(repo);
        c.AllStep();
        return;
    }
}
