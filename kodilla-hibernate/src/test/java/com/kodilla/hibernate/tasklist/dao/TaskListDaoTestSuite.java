package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    private final static String taskName = "To Do";

    @Autowired
    private TaskListDao taskListdao;

    @Test
    void testFindByListName() {
        //given
        TaskList tl = new TaskList(2, taskName);
        taskListdao.save(tl);

        //when
        List<TaskList> findTask = taskListdao.findByListName(tl.getListName());

        //then
        assertEquals(1, findTask.size());

        //clean up
        taskListdao.deleteAll();
    }
}
