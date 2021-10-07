package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("in progress")
    TaskList taskListInProg;
    TaskList taskListDone;
    TaskList taskListToDo;

    @Bean
    public Board boardGetter() {
        return new Board(taskListDone, taskListInProg, taskListToDo);
    }

    @Bean(name = "in progress")
    public TaskList progressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "done")
    public TaskList doneList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "toDo")
    public TaskList toDoList() {
        return new TaskList(new ArrayList<>());
    }
}
