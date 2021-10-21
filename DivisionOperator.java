package com.sdp;
public class DivisionOperator implements IOperator {
    @Override
    public void executeOperation(int Number1, int Number2) {
        System.out.println("DivisionOperator result : " + (Number1 / Number2));

    }
}
