package com.example.mvptictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity implements  BoardView {


    BoardPresenter presenter;

    TableLayout board;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new BoardPresenter(this);
        board= findViewById(R.id. board);

        for(byte row=0; row<3; row++){

            TableRow tableRow= (TableRow) board.getChildAt(row);
            for(byte col=0; col<3; col++){
                Button button = (Button) tableRow.getChildAt(col);
                BoardPresenter.CellClickListener buttonListener=new BoardPresenter.CellClickListener(presenter, row, col);
                button.setOnClickListener(buttonListener);
            }

        }



    }

    @Override
    public void newGame() {
        for(byte row=0; row<3; row++){

            TableRow tableRow= (TableRow) board.getChildAt(row);
            for(byte col=0; col<3; col++){
                Button button = (Button) tableRow.getChildAt(col);
                button.setText("");
                button.setEnabled(true);
        }

    }

    @Override
    public void putSymbol(char symbol, byte row, byte col) {
        TableRow



    }

    @Override
    public void gameEnded(byte winner) {

            for(byte row=0; row<3; row++){

                TableRow tableRow= (TableRow) board.getChildAt(row);
                for(byte col=0; col<3; col++){
                    Button button = (Button) tableRow.getChildAt(col);

                    button.setEnabled(false);
                }

    }
}