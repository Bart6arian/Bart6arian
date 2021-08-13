package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName
        ("TDD for shape catcher")
public class ShapeCatcherTestSuite {
    private static int testsToDo = 0;
    private static int testsLeft = 4;

    @BeforeAll
    static void bfAll() {
        System.out.println("Opening tests for all cases");
    }
    @AfterAll
    static void afAll() {
        System.out.println("All tests has been done");
    }
    @BeforeEach
    void bfEach() {
        testsToDo++;
        System.out.println("Tests to do: " + testsToDo);
    }
    @AfterEach
    void afEach() {
        testsLeft--;
        System.out.println("Tests left: "+testsLeft);
    }
    @Test
    void testShapeCatcherAddAndGetFig() {
        Circle circle = new Circle(5, "Circle");
        ShapeCatcher shapeCatcher = new ShapeCatcher();
        // when
        shapeCatcher.addFigure(circle);
        Shape result = shapeCatcher.getFigure(0);
        //then
        assertEquals(circle, result);
    }

    @Test
    void testShapeCatcherRemoveFig() {
        Circle circle = new Circle(5, "Circle");
        Triangle triangle = new Triangle(4, "Triangle", 5);
        Square square = new Square("Square", 5);
        ShapeCatcher shapeCatcher = new ShapeCatcher();
        shapeCatcher.addFigure(circle);
        shapeCatcher.addFigure(triangle);
        shapeCatcher.addFigure(square);
        //when
        boolean result = shapeCatcher.removeFigure(circle);
        //then
        assertTrue(result);
        assertEquals(2, shapeCatcher.getShapes().size());
    }
}
