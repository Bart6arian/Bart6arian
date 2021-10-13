package com.kodilla.patterns.factory.tasks;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TaskFactoryTestSuite {

    @Before
    public TaskFactory generateFactory() {
        TaskFactory factory = new TaskFactory();
        return factory;
    }

    @Test
    void testFactoryDrive() {
        //given
        //when
        Task drive = generateFactory().doTask(TaskFactory.DRIVING);
        //then

        assertEquals(false, drive.isTaskExecuted());
    }

    @Test
    void testFactoryPaint() {
        //given
        //when
        Task paint = generateFactory().doTask(TaskFactory.PAINTING);
        //then
        assertEquals(true, paint.isTaskExecuted());
    }

    @Test
    void testFactoryShopping() {
        //given
        //when
        Task shopping = generateFactory().doTask(TaskFactory.SHOPPING);
        //then
        assertEquals(false, shopping.isTaskExecuted());
    }
}
