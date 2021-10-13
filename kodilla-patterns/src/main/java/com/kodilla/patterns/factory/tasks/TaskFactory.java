package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTING = "PAINTING TASK";
    public static final String DRIVING = "DRIVING TASK";
    public static final String SHOPPING = "SHOPPING TASK";

    private static void error() {
        System.out.println("Incorrect task choice, please try again");
    }

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case PAINTING :
                return new PaintingTask("Paint to do", "Black", "Starry Night");
            case DRIVING :
                return new DrivingTask("Drive to: ", "Cracow", "BMW 760Li");
            case SHOPPING :
                return new ShoppingTask("To buy: ", "Carrots", 11);
            default :
                error();
                return null;
        }
    }
}
