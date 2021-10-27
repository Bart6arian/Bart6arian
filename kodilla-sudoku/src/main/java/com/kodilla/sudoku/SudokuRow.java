package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public final class SudokuRow {
    private List<SudokuElement> elements = new ArrayList<>();

    public SudokuRow() {
        for(int r = 0; r < 8; r++) {}
        elements.add(new SudokuElement());
    }

    public List<SudokuElement> getElements() {
        return elements;
    }
}
