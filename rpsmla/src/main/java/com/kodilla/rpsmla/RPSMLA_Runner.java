package com.kodilla.rpsmla;

import java.util.EnumSet;
import java.util.Scanner;

public class RPSMLA_Runner {
    public static void main(String[] args) {
        System.out.println("*==WELCOME TO THE GAME==*\n");
        System.out.println("Available figures: " +'\n');
        for(Figures figure : Figures.values()) {
                System.out.println(figure+" | Dedicated key for that figure to press - "+"["+figure.getType()+"]\n");
        }
        System.out.println("-- > RULES <--\n");
        Arena rock = new Arena(Figures.ROCK);
        rock.figsRules();
        Arena paper = new Arena(Figures.PAPER);
        paper.figsRules();
        Arena lizard = new Arena(Figures.LIZARD);
        lizard.figsRules();
        Arena mammoth = new Arena(Figures.MAMMOTH);
        mammoth.figsRules();
        Arena scissors = new Arena(Figures.SCISSORS);
        scissors.figsRules();
        Arena airship = new Arena(Figures.AIRSHIP);
        airship.figsRules();
        System.out.println("How do you call yourself, mighty player?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Welcome "+userInput +"! Lets start the game!");
        System.out.println("How many rounds you want to play?");
        int roundsToPlay = scanner.nextInt();

    }
}
