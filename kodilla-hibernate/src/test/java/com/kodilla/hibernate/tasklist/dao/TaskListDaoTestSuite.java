package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.Task;
import com.kodilla.hibernate.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(2,"ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListdao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskListDao.deleteById(id);
    }
}
