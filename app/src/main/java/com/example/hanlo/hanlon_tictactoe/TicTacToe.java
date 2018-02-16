package com.example.hanlo.hanlon_tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hanlo on 2/13/2018.
 */

public class TicTacToe extends Activity {
    public static  final String intent_message = "input_name";
    //tic tac toe variables
    public static final int EMPTY = 0;
    public static final int CROSS = 1;
    public static final int NOUGHT = 2;
    public static int playerMove = 0;

    // Name-constants to represent the various states of the game
    public static final int PLAYING = 0;
    public static final int TIE = 1;
    public static final int CROSS_WON = 2;
    public static final int NOUGHT_WON = 3;
    public static int gameState = 0;
    public static String winningPlayer = null;
    // The game board and the game status
    private static final int ROWS = 3, COLS = 3; // number of rows and columns
    private int[][] board = new int[ROWS][COLS]; // game board in 2D array
    private int sumX, sumY,sumXY = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String message = intent.getStringExtra(intent_message);
        winningPlayer = message;
        TextView textView = (TextView) findViewById(R.id.name_textView);
        textView.setText("Welcome to my game " + message + "!");
        findViewById(R.id.checkBox).setBackgroundResource(0);
        findViewById(R.id.checkBox2).setBackgroundResource(0);
        findViewById(R.id.checkBox3).setBackgroundResource(0);
        findViewById(R.id.checkBox4).setBackgroundResource(0);
        findViewById(R.id.checkBox5).setBackgroundResource(0);
        findViewById(R.id.checkBox6).setBackgroundResource(0);
        findViewById(R.id.checkBox7).setBackgroundResource(0);
        findViewById(R.id.checkBox8).setBackgroundResource(0);
        findViewById(R.id.checkBox9).setBackgroundResource(0);
        gameState = PLAYING;

    }

    //on click method sets the box to an x and also sets a value to the 2d array dataset
    public void onBoxClicked(View view){
        switch (view.getId()){
            case R.id.checkBox:
                if(board[0][0] == EMPTY && gameState == PLAYING) {
                    board[0][0] = CROSS;
                        playerMove = 0;
                    findViewById(R.id.checkBox).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox2:
                if(board[0][1] == EMPTY && gameState == PLAYING) {
                    board[0][1] = CROSS;
                    playerMove = 1;
                    findViewById(R.id.checkBox2).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox3:
                if(board[0][2] == EMPTY && gameState == PLAYING) {
                    board[0][2] = CROSS;
                    playerMove = 2;
                    findViewById(R.id.checkBox3).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox4:
                if(board[1][0] == EMPTY && gameState == PLAYING) {
                    board[1][0] = CROSS;
                    playerMove = 3;
                    findViewById(R.id.checkBox4).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox5:
                if(board[1][1] == EMPTY && gameState == PLAYING) {
                    board[1][1] = CROSS;
                    playerMove = 4;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox6:
                if(board[1][2] == EMPTY && gameState == PLAYING) {
                    board[1][2] = CROSS;
                    playerMove = 5;
                    findViewById(R.id.checkBox6).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox7:
                if(board[2][0] == EMPTY && gameState == PLAYING) {
                    board[2][0] = CROSS;
                    playerMove = 6;
                    findViewById(R.id.checkBox7).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox8:
                if(board[2][1] == EMPTY && gameState == PLAYING) {
                    board[2][1] = CROSS;
                    playerMove = 7;
                    findViewById(R.id.checkBox8).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
            case R.id.checkBox9:
                if(board[2][2] == EMPTY && gameState == PLAYING) {
                    board[2][2]  = CROSS;
                    playerMove = 8;
                    findViewById(R.id.checkBox9).setBackgroundResource(R.drawable.x);
                    gameState = checkForWinner();
                    if(gameState == PLAYING){setComputerMove(playerMove);}
                    gameState = checkForWinner();
                }
                break;
        }
    }

    public void setComputerMove(int playerMove) {
        switch (playerMove) {
            case 0:
                if (board[0][1] == EMPTY) {
                    board[0][1] = NOUGHT;
                    findViewById(R.id.checkBox2).setBackgroundResource(R.drawable.o);
                } else if (board[1][0] == EMPTY) {
                    board[1][0] = NOUGHT;
                    findViewById(R.id.checkBox4).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 1:
                if (board[0][2] == EMPTY) {
                    board[0][2] = NOUGHT;
                    findViewById(R.id.checkBox3).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                } else if (board[0][0] == EMPTY) {
                    board[0][0] = NOUGHT;
                    findViewById(R.id.checkBox).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 2:
                if (board[0][1] == EMPTY) {
                    board[0][1] = NOUGHT;
                    findViewById(R.id.checkBox2).setBackgroundResource(R.drawable.o);
                } else if (board[1][2] == EMPTY) {
                    board[1][2] = NOUGHT;
                    findViewById(R.id.checkBox6).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 3:
                if (board[0][0] == EMPTY) {
                    board[0][0] = NOUGHT;
                    findViewById(R.id.checkBox).setBackgroundResource(R.drawable.o);
                } else if (board[2][0] == EMPTY) {
                    board[2][0] = NOUGHT;
                    findViewById(R.id.checkBox7).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 4:
                if (board[0][1] == EMPTY) {
                    board[0][1] = NOUGHT;
                    findViewById(R.id.checkBox2).setBackgroundResource(R.drawable.o);
                } else if (board[1][0] == EMPTY) {
                    board[1][0] = NOUGHT;
                    findViewById(R.id.checkBox4).setBackgroundResource(R.drawable.o);
                } else if (board[1][2] == EMPTY) {
                    board[1][2] = NOUGHT;
                    findViewById(R.id.checkBox6).setBackgroundResource(R.drawable.o);
                } else if (board[2][1] == EMPTY) {
                    board[2][1] = NOUGHT;
                    findViewById(R.id.checkBox8).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 5:
                if (board[0][2] == EMPTY) {
                    board[0][2] = NOUGHT;
                    findViewById(R.id.checkBox3).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                } else if (board[2][2] == EMPTY) {
                    board[2][2] = NOUGHT;
                    findViewById(R.id.checkBox9).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 6:
                if (board[1][0] == EMPTY) {
                    board[1][0] = NOUGHT;
                    findViewById(R.id.checkBox4).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                } else if (board[2][1] == EMPTY) {
                    board[2][1] = NOUGHT;
                    findViewById(R.id.checkBox8).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 7:
                if (board[2][0] == EMPTY) {
                    board[2][0] = NOUGHT;
                    findViewById(R.id.checkBox7).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                } else if (board[2][2] == EMPTY) {
                    board[2][2] = NOUGHT;
                    findViewById(R.id.checkBox9).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
            case 8:
                if (board[1][2] == EMPTY) {
                    board[1][2] = NOUGHT;
                    findViewById(R.id.checkBox6).setBackgroundResource(R.drawable.o);
                } else if (board[2][1] == EMPTY) {
                    board[2][1] = NOUGHT;
                    findViewById(R.id.checkBox8).setBackgroundResource(R.drawable.o);
                } else if (board[1][1] == EMPTY) {
                    board[1][1] = NOUGHT;
                    findViewById(R.id.checkBox5).setBackgroundResource(R.drawable.o);
                }
                ;
                break;
        }
    }

    public int checkForWinner() {
        // For loop to Check each row to see if there is a winner
        // BY using the value of that cell to sum to either 3 or -3
        // in order to tell which player won
        int winner = PLAYING;
        outerLoop:
        for (int row = 0; row < ROWS; ++row) {
            int sumX = 0;
            for (int col = 0; col < COLS; ++col) {
                if (board[row][col] == CROSS) {
                    sumX += 1;
                }else if (board[row][col] == NOUGHT) {
                    sumX -= 1;
                }

            }
            if (sumX == 3) {
                winner = CROSS_WON;
                break outerLoop;
            }
            else if (sumX == -3) {
                winner = NOUGHT_WON;
                break outerLoop;
            }
        }
        // Another For loop to check the columns for a winner
        // using the same algorithm as before.
        outerLoop:
        for (int col = 0; col < COLS; ++col) {
            int sumY = 0;
            for (int row = 0; row < ROWS; ++row) {
                if (board[row][col] == CROSS) {
                    sumY += 1;
                }else if (board[row][col] == NOUGHT) {
                    sumY -= 1;
                }
            }
            if (sumY == 3) {
                winner =  CROSS_WON;
                break outerLoop;
            }
            else if (sumY == -3) {
                winner = NOUGHT_WON;
                break outerLoop;
            }
        }

        // Final check for diagonal victory
        if (board[0][0] == CROSS && board[1][1] == CROSS && board[2][2] == CROSS) {
            winner = CROSS_WON;
        }else if (board[0][2] == NOUGHT && board[1][1] == NOUGHT && board[2][0] == NOUGHT) {
            winner = NOUGHT_WON;
        }

        if(winner == CROSS_WON || winner == NOUGHT_WON){
            //make a toast to display who won.
            Context context = getApplicationContext();
            if(winner == CROSS_WON) {
                Toast.makeText(context, "Congratulations, " + winningPlayer + " you win! ", Toast.LENGTH_LONG).show();
                View restart = findViewById(R.id.restart_Game);
                restart.setVisibility(View.VISIBLE);
            }
            else if(winner == NOUGHT_WON){
                Toast.makeText(context, "Sorry, you lose :(", Toast.LENGTH_LONG).show();
                View restart = findViewById(R.id.restart_Game);
                restart.setVisibility(View.VISIBLE);
            }
            else{
                Toast.makeText(context, "It's a Tie", Toast.LENGTH_LONG).show();
                View restart = findViewById(R.id.restart_Game);
                restart.setVisibility(View.VISIBLE);
            }
        }
        return winner;
    }

    public void restartGame(View view){
        Context context = getApplicationContext();
        View restart = findViewById(R.id.restart_Game);
        restart.setVisibility(View.INVISIBLE);
        board = new int[ROWS][COLS];
        gameState = PLAYING;
        findViewById(R.id.checkBox).setBackgroundResource(0);
        findViewById(R.id.checkBox2).setBackgroundResource(0);
        findViewById(R.id.checkBox3).setBackgroundResource(0);
        findViewById(R.id.checkBox4).setBackgroundResource(0);
        findViewById(R.id.checkBox5).setBackgroundResource(0);
        findViewById(R.id.checkBox6).setBackgroundResource(0);
        findViewById(R.id.checkBox7).setBackgroundResource(0);
        findViewById(R.id.checkBox8).setBackgroundResource(0);
        findViewById(R.id.checkBox9).setBackgroundResource(0);
        Toast.makeText(context, "Good Luck!", Toast.LENGTH_SHORT).show();

    }
}
