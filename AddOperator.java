package com.sdp;
public class AddOperator implements IOperator {

    @Override
    public void executeOperation(int a, int b) {
        System.out.println("AddOperator result : " + (a + b));
    }
}
