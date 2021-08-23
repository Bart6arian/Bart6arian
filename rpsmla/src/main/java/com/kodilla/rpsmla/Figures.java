package com.kodilla.rpsmla;

public enum Figures {
    ROCK(1), PAPER(2), SCISSORS(3), MAMMOTH(4), AIRSHIP(5), LIZARD(6);

    private final int type;
    Figures(int type) {
        this.type =type;
    }

    public int getType() {
        return type;
    }
}
