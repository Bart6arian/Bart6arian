package com.kodilla.patterns.builder.checkers;

public final class Factory {
    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFig(String figType, String color) {
        if(figType.equals(PAWN)) {
            return new Pawn(color);
        } else {
            if(figType.equals(QUEEN)) {
                return new Queen(color);
            } else
                throw new IllegalStateException("Figure can be QUEEN or PAWN");
        }
    }
}
