package com.kodilla.rpsmla;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameMechanics {
    private Figures figures;
    private GameResult gameResult;

    public static int difficulty() {
        System.out.println("Please set difficulty level:\n[1]-easy\n[2]-hard");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int setRandomFigure() {
        int random = new Random().nextInt(5);
        return random;
    }

    public static void gameDifficulty() {
        if(difficulty() == 1) {
            if(UserDialogs.choseFigure(1) || UserDialogs.choseFigure(2) || UserDialogs.choseFigure(3)
            || UserDialogs.choseFigure(4) || UserDialogs.choseFigure(5) || UserDialogs.choseFigure(6)) {
                GameMechanics.setRandomFigure();
            }
        }

    }

}
