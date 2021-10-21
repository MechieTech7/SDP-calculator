package com.sdp;
public class AddOperator implements IOperator {

    @Override
    public void executeOperation(int Number1, int Number2) {
        System.out.println("AddOperator result : " + (Number1 + Number2));
    }
}
