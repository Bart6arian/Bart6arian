package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "message");
        } catch (MessageNotSentException e) {
            System.out.println("Message was not send! " + "App is doing great despite of that");
        }
        System.out.println("Processing other logic!");

    }
}
