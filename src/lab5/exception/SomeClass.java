package lab5.exception;

import java.sql.SQLOutput;

public class SomeClass {
    public void methodUncheckedException(int i){
        if(i==0) {
            UnChException e = new UnChException("created in methodUncheckedException Divide by 0");
            throw e;
        }
        System.out.println("After unch exception. Result=" + 5/i);
    }

    public void methodCheckedException(int i) throws ChException{
        if(i==2){
            ChException ce = new ChException("Number 2 not accepted");
            throw ce;
        }
    }
}
