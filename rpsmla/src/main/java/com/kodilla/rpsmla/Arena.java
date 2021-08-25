package com.kodilla.rpsmla;

import java.util.EnumSet;

public class Arena {
    private Figures figures;
    private GameResult result;
    private static EnumSet<Figures> figsSet = EnumSet.of(Figures.AIRSHIP, Figures.LIZARD, Figures.PAPER, Figures.ROCK, Figures.MAMMOTH, Figures.SCISSORS);

    public Arena(Figures figures) {
        this.figures = figures;
    }

    public static EnumSet<Figures> getFigsSet() {
        return figsSet;
    }

    public static void getInstruction() {
        for(Figures figure : Figures.values()) {
            System.out.println(figure+" | Dedicated key for that figure to press - "+"["+figure.getType()+"]\n");
        }
    }

    public void figsRules() {
        switch (figures) {
            case ROCK:
                System.out.println("ROCK: ");
                System.out.println("Rock beats scissors");
                System.out.println("Rock smashes lizard");
                System.out.println();
                break;
            case PAPER:
                System.out.println("PAPER: ");
                System.out.println("Paper cover rock");
                System.out.println("Paper blinds mammoth");
                System.out.println("Paper disables airship to fly");
                System.out.println();
                break;
            case LIZARD:
                System.out.println("LIZARD: ");
                System.out.println("Lizard eats paper");
                System.out.println("Lizard bites airship");
                System.out.println("Lizard scares mammoth");
                System.out.println();
                break;
            case SCISSORS:
                System.out.println("SCISSORS: ");
                System.out.println("Scissors hurts lizard");
                System.out.println("Scissors cut paper");
                System.out.println("Scissors shaves mammoth");
                System.out.println();
                break;
            case MAMMOTH:
                System.out.println("MAMMOTH: ");
                System.out.println("Mammoth crushes stone");
                System.out.println("Mammoth destroys airship");
                System.out.println();
                break;
            case AIRSHIP:
                System.out.println("AIRSHIP: ");
                System.out.println("Airship throws stone");
                System.out.println("Airship flight higher than scissors");
                System.out.println();
                break;
        }
    }

}
