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


    public static void sayHello(String inputUser) {
        System.out.println("Welcome "+inputUser +"! Lets start the game!");
    }

    public static int getFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your figure!");
        return scanner.nextInt();
    }

    public static boolean choseFigure(int figGetter) {
        if(figGetter == Figures.ROCK.getType()) {
            System.out.println("Your choice: ROCK!");
        } else {
            if(figGetter == Figures.PAPER.getType()) {
                System.out.println("Your choice: PAPER!");
            } else {
                if(figGetter == Figures.SCISSORS.getType()) {
                    System.out.println("Your choice: SCISSORS!");
                } else {
                    if(figGetter == Figures.MAMMOTH.getType()) {
                        System.out.println("Your choice: MAMMOTH!");
                    } else {
                        if(figGetter== Figures.AIRSHIP.getType()) {
                            System.out.println("Your choice: AIRSHIP!");
                        } else {
                            if(figGetter == Figures.LIZARD.getType()) {
                                System.out.println("Your choice: LIZARD!");
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
