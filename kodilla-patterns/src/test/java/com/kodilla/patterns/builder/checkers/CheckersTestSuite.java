package com.kodilla.patterns.builder.checkers;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CheckersTestSuite {

    @Test
    void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(Factory.PAWN, Figure.WHITE, 3, 0)
                .Figure(Factory.PAWN, Figure.BLACK, 7, 9)
                .Figure(Factory.QUEEN, Figure.WHITE, 2, 0)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure figureOne = checkers.getBoard().getFigure(3, 0);
        Figure figureTwo = checkers.getBoard().getFigure(7, 9);
        Figure figureThree = checkers.getBoard().getFigure(2, 0);
        Figure figureFour = checkers.getBoard().getFigure(1, 1);

        //Then
        assertEquals(Figure.WHITE, figureOne.getColor());
        assertEquals(Pawn.class, figureTwo.getClass());
        assertEquals(Queen.class, figureThree.getClass());
        assertNull(figureFour);
    }

    private void assertNull(Figure figureFour) {
    }
}