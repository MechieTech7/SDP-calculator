package com.sdp;

public class Calculator {
    private IOperator _operator;
    public Calculator(IOperator ioperator)
    {
        _operator = ioperator;
    }
    public void Calculate(int Number1, int Number2)
    {
        _operator.executeOperation(Number1 , Number2);
    }
}
