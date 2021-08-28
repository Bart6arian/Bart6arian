package com.kodilla.rpsmla;

import java.util.Random;
import java.util.Scanner;

public class GameMechanics {
    private Figures figures;
    private GameResult result;

    public static int difficulty() {
        System.out.println("Please set difficulty level:\n[1]-easy\n[2]-hard\n[3]-impossible");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int setFigure() {
        int random = new Random().nextInt(6);
        return random;
    }

    public static void gameDifficulty(int difficulty) {
        if(difficulty() == 1) {

        }

    }

}
