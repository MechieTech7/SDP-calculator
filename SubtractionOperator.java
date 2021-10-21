package com.sdp;
public class SubtractOperator implements IOperator {
    @Override
    public void executeOperation(int Number1, int Number2) {
        System.out.println("SubtarctOperator result : " + (Number1 - Number2));
    }
}
