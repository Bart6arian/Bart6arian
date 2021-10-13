package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "TO DO: " + '\n' + "Drive to "+ where + " by: " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(where.equals("Warsaw")) {
            return true;
        } else {
            return false;
        }
    }
}
