package com.kodilla.rpsmla;

import java.util.Random;
import java.util.Scanner;

public class GameMechanics {
    private Figures figures;
    private GameResult gameResult;

    public static String newGame() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean confirm(String newGame) {
        boolean result = false;
        if(newGame.equals("n")) {
            System.out.println("Do you want to play new game? yes / no");
            Scanner scanner = new Scanner(System.in);
            String confirm = scanner.nextLine();
            if(confirm.equals("yes")) {
                System.out.println("Let's play new game");
                result = true;
            } if(confirm.equals("no")) {
                result = false;
            }
        }
        return result;
    }

    public static int setRandomFigure() {
        int random = new Random().nextInt(6)+1;
        if(random == Figures.ROCK.getType() ) {
            System.out.println("Computer's choice: ROCK!");
        } else {
            if(random == Figures.PAPER.getType()) {
                System.out.println("Computer's choice: PAPER!");
            } else {
                if(random == Figures.SCISSORS.getType()) {
                    System.out.println("Computer's choice: SCISSORS!");
                } else {
                    if(random == Figures.MAMMOTH.getType()) {
                        System.out.println("Computer's choice: MAMMOTH!");
                    } else {
                        if(random == Figures.AIRSHIP.getType()) {
                            System.out.println("Computer's choice: AIRSHIP!");
                        } else {
                            System.out.println("Computer's choice: LIZARD! ");
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static String play() {
        System.out.println("Welcome to the game!");
        System.out.println("If you want to start press [p]\nIf yo want to end press [x]");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean endGame(String play) {
        boolean result = false;
        if(play.equals("p")) {
            System.out.println("Let's play");
            result = true;
        } else {
            if (play.equals("x")) {
                System.out.println("Do you want to end game? yes / no");
                Scanner scanner = new Scanner(System.in);
                String confirm = scanner.nextLine();
                if (confirm.equals("yes")) {
                    result = true;
                    System.out.println("Goodbye!");
                } else {
                    if (confirm.equals("no")) {
                        result = true;
                        System.out.println("Ufff...");
                        GameMechanics.play();
                    }
                }
            }
        }
        return result;
    }

}
