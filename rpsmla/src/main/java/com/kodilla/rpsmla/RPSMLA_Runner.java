package com.kodilla.rpsmla;

import java.util.Scanner;

public class RPSMLA_Runner {
    private  Figures figure;

    public static void main(String[] args) {
        System.out.println("*==WELCOME TO THE GAME==*\n");
        System.out.println("Available figures: " +'\n');
        Arena.getInstruction();
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
        //
        String inputUser = UserDialogs.getUserName();
        UserDialogs.sayHello(inputUser);
        int numberOfRounds = UserDialogs.getNumberOfRounds();
        int figGetter = UserDialogs.getFigure();
        UserDialogs.roundsLeft(numberOfRounds);
        UserDialogs.choseFigure(figGetter);
        //



    }
}
