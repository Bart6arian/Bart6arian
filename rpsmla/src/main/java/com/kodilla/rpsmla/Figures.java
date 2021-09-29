package com.kodilla.rpsmla;

import java.util.Arrays;
import java.util.Random;

public enum Figures {
    ROCK(1), PAPER(2), SCISSORS(3), MAMMOTH(4), AIRSHIP(5), LIZARD(6);

    private int type;
    Figures(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
