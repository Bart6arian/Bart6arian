package com.kodilla.patterns2.observer.homework;

import java.util.LinkedList;
import java.util.Queue;

public class Mentor implements SystemUpdate {
    private final String name;
    private final String lname;
    private final Field field;
    private final Queue<KodillaStudent> students;

    public Mentor(String name, String lname, Field field) {
        this.name = name;
        this.lname = lname;
        this.field = field;
        students = new LinkedList<>();
    }

    public Queue<KodillaStudent> getStudents() {
        return students;
    }

    public void addStudents(KodillaStudent kodillaStudent) {
        students.add(kodillaStudent);
    }

    @Override
    public void update(HomeworkTask homeworkTask) {
        System.out.println("You received new homework to check " +homeworkTask.getTaskId());
    }

    @Override
    public String studentParams(KodillaStudent kodillaStudent) {
        String student = kodillaStudent.getName() + " " + kodillaStudent.getLname();
        String details = "\n Id: "+kodillaStudent.getId() + " Field: " +kodillaStudent.getField();
        return student + details;
    }

    @Override
    public boolean decision(boolean result) {
        return result;
    }
}
