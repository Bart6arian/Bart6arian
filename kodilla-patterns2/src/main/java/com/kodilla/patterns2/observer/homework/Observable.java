package com.kodilla.patterns2.observer.homework;

public interface Observable {

    boolean isAccepted(Mentor mentor, boolean result);
    String comment(String desc);
    double getTaskId();
}
