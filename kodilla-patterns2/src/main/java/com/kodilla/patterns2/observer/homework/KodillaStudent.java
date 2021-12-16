package com.kodilla.patterns2.observer.homework;

public class KodillaStudent {
    private final String name;
    private final String lname;
    private final long id;
    private final Field field;

    public KodillaStudent(String name, String lname, long id, Field field) {
        this.name = name;
        this.lname = lname;
        this.id = id;
        this.field = field;
    }


    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public long getId() {
        return id;
    }

    public Field getField() {
        return field;
    }
}
