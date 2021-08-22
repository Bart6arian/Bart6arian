package com.kodilla.rpsmla;

public final class Rock {
    private final String name;

    public Rock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rock)) return false;

        Rock rock = (Rock) o;

        return getName() != null ? getName().equals(rock.getName()) : rock.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

}
