package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList addToDoList() {
        List<String> toDo = new ArrayList<>();
        toDo.add("Tide room");
        toDo.add("Make bed");
        toDo.add("Cook dinner");
        return new TaskList(toDo);
    }

    public TaskList addProgressList() {
        List<String> inProg = new ArrayList<>();
        inProg.add("Shopping");
        return new TaskList(inProg);
    }

    public TaskList addDoneList() {
        List<String> done = new ArrayList<>();
        done.add("Walk with dog");
        done.add("Clean the dog");
        return new TaskList(done);
    }
}
