package com.kodilla.patterns2.observer.homework;

public interface SystemUpdate {

    void update(HomeworkTask homeworkTask);
    String studentParams(KodillaStudent kodillaStudent);
    boolean decision(boolean result);
}
