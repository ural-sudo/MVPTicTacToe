package com.example.mvptictactoe;

public class Board {

    private byte[][] board = new byte[3][3];
    private static  byte PLAYER_1_SYMBOL = 1;
    private static  byte PLAYER_2_SYMBOL = 2;


    private  boolean player1Turn = true;

    BoardListener boardListener;

    public Board(BoardListener boarListener) {
        this.boardListener = boardListener;
    }

    public void  move(byte row, byte col){

        if(player1Turn){

            board[row][col] =  PLAYER_1_SYMBOL;
            boardListener.playedAt(BoardListener.PLAYER_1, row,col);

        }else {
            board[row][col] = PLAYER_2_SYMBOL;
            boardListener.playedAt(BoardListener.PLAYER_2, row,col);
        }
        player1Turn = !player1Turn;


    }
}
