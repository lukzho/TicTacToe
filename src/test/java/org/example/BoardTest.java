package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;
    @BeforeEach
    public void setUp(){
        board = new Board();
    }

    @Test
    void isCellEmpty_test_empty() {
        assertTrue(board.isCellEmpty(1, 1));
    }
    @Test
    void isCellEmpty_test_full() {
        board.cells[0][0]='X';
        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test
    void isCellEmpty_test_invalid_input(){
        assertFalse(board.isCellEmpty(-1, 0));
        assertFalse(board.isCellEmpty(0, -1));
        assertFalse(board.isCellEmpty(4, -1));
    }

    @Test
    void place_test_placement(){
        board.place(1,2,'X');
        assertEquals('X',board.cells[1][2]);
    }

}
/*
*
private IntSet set;

@BeforeEach
    public void setUp(){
        set = new IntSet(4);
    }
*/