package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "TO DO" + '\n' + "Buy: " +whatToBuy + " " + quantity +" pcs";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(quantity != 10) {
            return false;
        } else
            return false;
    }
}
