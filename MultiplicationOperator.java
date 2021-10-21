package com.sdp;

public class MultiplicationOperator implements IOperator {
    @Override
    public void executeOperation(int Number1, int Number2) {
        System.out.println("MultiplicationOperator result : " + (Number1 * Number2));
    }
}
