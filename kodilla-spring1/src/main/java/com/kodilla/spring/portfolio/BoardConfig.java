package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {


    @Bean
    public Board boardGetter(TaskList taskListDone, TaskList taskListInProg, TaskList taskListToDo) {
        return new Board(taskListDone, taskListInProg, taskListToDo);
    }

    @Bean
    public TaskList taskListDone() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public TaskList taskListInProg() {
        return new TaskList(new ArrayList<>());
    }

    @Bean
    public TaskList taskListToDo() {
        return new TaskList(new ArrayList<>());
    }
}
