package com.kodilla.patterns2.observer.homework;

public class HomeworkTask implements Observable {

    private final double taskId;
    private final String comment;

    public HomeworkTask(double taskId, String comment) {
        this.taskId = taskId;
        this.comment = comment;
    }

    @Override
    public double getTaskId() {
        return taskId;
    }

    @Override
    public boolean isAccepted(Mentor mentor, boolean result) {
        return result;
    }

    @Override
    public String comment(String desc) {
        return desc;
    }
}
