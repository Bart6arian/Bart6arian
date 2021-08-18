package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double a, double b, double c, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b, c);
        System.out.println("Result is: " +result);
    }
}
