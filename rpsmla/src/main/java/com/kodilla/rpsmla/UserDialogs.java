package com.kodilla.rpsmla;

import java.util.Scanner;

public class UserDialogs {

    public static String getUserName() {
        System.out.println("How do you call yourself, player?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("How many rounds want you to play?");
            String text = scanner.nextLine();
            try {
                int number = Integer.parseInt(text);
                if(number > 0 && number < 10)
                    return number;
            } catch (Exception e) {

            }
            System.out.println("Wrong number, try again");
        }
    }

    public static int roundsLeft(int numberOfRounds) {
        int roundsToGo = 0;
        while((numberOfRounds > roundsToGo) && numberOfRounds > 0) {
            for(int x = 1; x < numberOfRounds; x++) {
                numberOfRounds--;
                System.out.println("Rounds to go: " +numberOfRounds);
                roundsToGo++;
                System.out.println("Rounds done: "+ roundsToGo);
            }
        }
        return roundsToGo;
    }

    public static void sayHello(String inputUser) {
        System.out.println("Welcome "+inputUser +"! Lets start the game!");
    }

    public static int getFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your figure!");
        return scanner.nextInt();
    }

    public static boolean choseFigure(int figGetter) {
        if(figGetter == 1) {
            System.out.println("ROCK!");
        } else {
            if(figGetter == 2) {
                System.out.println("PAPER!");
            } else {
                if(figGetter == 3) {
                    System.out.println("SCISSORS!");
                } else {
                    if(figGetter == 4) {
                        System.out.println("MAMMOTH!");
                    } else {
                        if(figGetter== 5) {
                            System.out.println("AIRSHIP!");
                        } else {
                            if(figGetter == 6) {
                                System.out.println("LIZARD!");
                            } else
                                System.out.println("Wrong figure, please try again");
                        }
                    }
                }
            }
        }
        return false;
    }
}
