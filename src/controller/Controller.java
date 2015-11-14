package controller;

import domain.*;
import models.*;
import domain.VariableExpression;
import repository.IProgramRepository;

/**
 * Created by Andra on 10/26/2015.
 */
public class Controller {
    private IProgramRepository repo;
    private SkipStatement skip;
    public Controller(IProgramRepository r){
        this.repo=r;
    }
    void OneStep(ProgramState state){
        IStack stk =state.getStack();
                if(stk.isEmpty()){
            System.out.println("The stack is empty!");
            return;
        }
        IStatement crtStatement = stk.pop();
        if(crtStatement instanceof CompoundStatement){
            CompoundStatement crtStatement1=(CompoundStatement)crtStatement;
            stk.push(crtStatement1.Statement2);
            stk.push(crtStatement1.Statement1);
            return;}
        if(crtStatement instanceof SwitchStatement){
            SwitchStatement crtStatement1=(SwitchStatement)crtStatement;
            String v = crtStatement1.varname;
            IExpression exp1 = crtStatement1.ex1;
            IExpression exp2 = crtStatement1.ex2;
            IStatement i1 = crtStatement1.i;
            IStatement i2 = crtStatement1.i2;
            IStatement i3 = crtStatement1.i3;

            IfStatement ifst = new IfStatement(new ArithmeticExpression(new VariableExpression( v ),exp2,"-"),new IfStatement
                    (new ArithmeticExpression(new VariableExpression(v),exp1,"-"),i3,i1),i2);
            stk.push(ifst);
        }
        if(crtStatement instanceof AssignmentStatement){

            AssignmentStatement crtStatement1 =(AssignmentStatement)crtStatement;
            IExpression exp= crtStatement1.Expression;
            String id = crtStatement1.Id;
            Dictionary symTble = state.getSymTable();
            int val=exp.Eval(symTble);

            symTble.add(id,val);
            return;
        }
        if(crtStatement instanceof IfStatement){

            IfStatement crtStatement1=(IfStatement)crtStatement;
            if(crtStatement1.StatementElse==null) {
                crtStatement1.set(new SkipStatement());
                stk.push(crtStatement1);
                return;
            }
            if(crtStatement1.Expression.Eval(state.getSymTable())!=0){
                stk.push(crtStatement1.StatementThen);
            }
            else
            {
                stk.push(crtStatement1.StatementElse);
            }

           return;
        }
        if(crtStatement instanceof WhileStatement)
            {
                WhileStatement crtStatement1=(WhileStatement)crtStatement;
                if(crtStatement1.Expression.Eval(state.getSymTable())!=0)
                    {
                    stk.push(crtStatement1);
                        stk.push(crtStatement1.Statement1);

                    }
              return;


            }
        if(crtStatement instanceof SkipStatement)
        {

            return;
        }
        if(crtStatement instanceof PrintStatement){
            PrintStatement crtStatement1=(PrintStatement)crtStatement;
            IList out= state.getOut();
            Dictionary symTable=state.getSymTable();

            IExpression ex = crtStatement1.getExpression();
            VariableExpression v = (VariableExpression)ex;
            //out.add(crtStatement1.Eval());
           // out.add(crtStatement1.getExpression().Eval(state.getSymTable()));
            out.add(crtStatement1.Expression.Eval(state.getSymTable()));
          //  out.add(v.Eval(symTable));

            return;

        }

    }
    public void AllStep(){

       ProgramState prg=repo.getCurrentProgram();
        System.out.println(prg.getOut().ToString());
        System.out.println(prg.getStack().ToString());
        System.out.println(prg.getSymTable().ToString());
        System.out.println();

        while (!prg.getStack().isEmpty()){
            OneStep(prg);
            System.out.println(prg.getOut().ToString());
            System.out.println(prg.getStack().ToString());
            System.out.println(prg.getSymTable().ToString());
            System.out.println();

        }


    }

}


