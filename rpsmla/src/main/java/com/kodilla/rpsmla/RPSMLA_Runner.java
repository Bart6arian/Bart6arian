package com.kodilla.rpsmla;

import java.util.Scanner;

public class RPSMLA_Runner {
    private  Figures figure;

    public static void main(String[] args) {
        System.out.println("*==WELCOME TO THE GAME==*\n");
        System.out.println("Available figures: " + '\n');
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

        String play = GameMechanics.play();
        GameMechanics.endGame(play);
        String inputUser = UserDialogs.getUserName();
        UserDialogs.sayHello(inputUser);
        int numberOfRounds = UserDialogs.getNumberOfRounds();
        int roundsLeft = 0;
        while(numberOfRounds > 0) {
            int figGetter = UserDialogs.getFigure();
            UserDialogs.choseFigure(figGetter);
            GameMechanics.setRandomFigure();
            numberOfRounds--;
            System.out.println("Rounds left: "+numberOfRounds);
            roundsLeft++;
            System.out.println("Rounds done: "+roundsLeft);
        }
        System.out.println("Thank you for play!");
    }
}
