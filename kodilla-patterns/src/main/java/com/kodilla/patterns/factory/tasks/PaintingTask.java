package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "TO DO: " +'\n' + "Paint " + whatToPaint + " by: "
                + color + " color";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(color.startsWith("B")) {
            return true;
        } else
            return false;
    }
}
