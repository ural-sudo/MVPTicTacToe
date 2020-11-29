package com.example.mvptictactoe;

import android.view.View;

public class BoardPresenter {


    BoardView view;
    public BoardPresenter(BoardView boardView) {

        view = boardView;
    }

    static class CellClickListener implements View.OnClickListener {

        BoardPresenter presenter;
        byte row;
        byte col;

        public CellClickListener(BoardPresenter presenter, byte row, byte col) {

            this.presenter = presenter;
            this.row = row;
            this.col = col;
        }
        @Override
        public void onClick(View v);

    }
}
