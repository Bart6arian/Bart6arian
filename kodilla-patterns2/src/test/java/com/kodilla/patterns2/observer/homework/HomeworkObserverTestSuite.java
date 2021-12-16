package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HomeworkObserverTestSuite {

    HomeworkTask homeworkTask = new HomeworkTask(23.3, "");
    HomeworkTask homeworkTask2 = new HomeworkTask(12.1, "How can I make it faster?");
    HomeworkTask homeworkTask3 = new HomeworkTask(9.5, "No idea how to make tests for it");
    Mentor mentor1 = new Mentor("Pablo", "Apollo", Field.JAVA);
    Mentor mentor2 = new Mentor("Derek", "Fire", Field.FULL_STACK);
    KodillaStudent student2 = new KodillaStudent("Monica", "Relly", 4547888, Field.JAVA);
    KodillaStudent student3 = new KodillaStudent("Phebe", "Snake", 1234567, Field.JAVA);
    KodillaStudent student4 = new KodillaStudent("Chandler", "Terrible", 7895001, Field.FULL_STACK);

    @AfterEach
    public void clearList() {
        mentor1.getStudents().clear();
        mentor2.getStudents().clear();
    }

    @Test
    public void testMentorTaskQueue() {
        //given
        mentor1.addStudents(student2);
        mentor1.addStudents(student3);
        mentor2.addStudents(student4);
        //when
        mentor1.update(homeworkTask);
        mentor1.update(homeworkTask2);
        mentor2.update(homeworkTask3);
        //then
        assertEquals(2, mentor1.getStudents().size());
        assertEquals(1, mentor2.getStudents().size());
    }

    @Test
    public void testMentorDecision() {
        //given
        mentor1.addStudents(student2);
        mentor1.addStudents(student3);
        mentor2.addStudents(student4);
        //when
        boolean yes = true;
        boolean no = false;
        boolean mentor2Decision = mentor2.decision(yes);
        boolean mentor1Decision = mentor1.decision(no);
        //then
        assertTrue(homeworkTask.isAccepted(mentor2, mentor2Decision));
        assertFalse(homeworkTask2.isAccepted(mentor1, mentor1Decision));
    }

    @Test
    public void testGetFirstStudent() {
        //given
        mentor1.addStudents(student2);
        mentor1.addStudents(student3);
        mentor2.addStudents(student4);
        //when
        KodillaStudent firstStudent = mentor1.getStudents().poll();
        //then
        assertEquals(student2, firstStudent);
    }
}
