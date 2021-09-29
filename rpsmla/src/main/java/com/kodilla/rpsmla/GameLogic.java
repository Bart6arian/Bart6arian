package com.kodilla.rpsmla;

import java.util.Random;

public class GameLogic {

    public static boolean logic() {
        boolean as = Figures.AIRSHIP.getType() > Figures.SCISSORS.getType();
        boolean ar = Figures.AIRSHIP.getType() > Figures.ROCK.getType();
        boolean rs = Figures.ROCK.getType() > Figures.SCISSORS.getType();
        boolean rl = Figures.ROCK.getType() > Figures.LIZARD.getType();
        boolean pr = Figures.PAPER.getType() > Figures.ROCK.getType();
        boolean pm = Figures.PAPER.getType() > Figures.MAMMOTH.getType();
        boolean pa = Figures.PAPER.getType() > Figures.AIRSHIP.getType();
        boolean sp = Figures.SCISSORS.getType() > Figures.PAPER.getType();
        boolean sm = Figures.SCISSORS.getType() > Figures.MAMMOTH.getType();
        boolean sl = Figures.SCISSORS.getType() > Figures.LIZARD.getType();
        boolean mr = Figures.MAMMOTH.getType() > Figures.ROCK.getType();
        boolean ma = Figures.MAMMOTH.getType() > Figures.AIRSHIP.getType();
        boolean lp = Figures.LIZARD.getType() > Figures.PAPER.getType();
        boolean la = Figures.LIZARD.getType() > Figures.AIRSHIP.getType();
        boolean lm = Figures.LIZARD.getType() > Figures.MAMMOTH.getType();
        return false;
    }
}
