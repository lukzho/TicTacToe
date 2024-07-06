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
        assertTrue(board.isCellEmpty(1, 2));
    }
    @Test
    void isCellEmpty_test_full() {
        board.cells[0][1]='X';
        assertFalse(board.isCellEmpty(0, 1));
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
    @Test
    void hasEnded(){
        board.cells[0][0]='X';
        board.cells[1][1]='X';
        board.cells[2][2]='X';
        assertTrue(board.hasWinner());
        board.cells[0][0]='X';
        board.cells[0][1]='X';
        board.cells[0][2]='X';
        assertTrue(board.hasWinner());
        board.cells[1][0]='X';
        board.cells[1][1]='X';
        board.cells[1][2]='X';
        assertTrue(board.hasWinner());
        board.cells[2][0]='X';
        board.cells[2][1]='X';
        board.cells[2][2]='X';
        assertTrue(board.hasWinner());
        board.cells[0][0]='X';
        board.cells[1][0]='X';
        board.cells[2][0]='X';
        assertTrue(board.hasWinner());
        board.cells[0][1]='X';
        board.cells[1][1]='X';
        board.cells[2][1]='X';
        assertTrue(board.hasWinner());
        board.cells[0][2]='X';
        board.cells[1][2]='X';
        board.cells[2][2]='X';
        assertTrue(board.hasWinner());
        board.cells[0][2]='X';
        board.cells[1][1]='X';
        board.cells[2][0]='X';
        assertTrue(board.hasWinner());
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