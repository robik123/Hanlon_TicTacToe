import java.util.Scanner;

/**
 * TicTacToe class implements the interface
 * @author relkharboutly
 * @date 1/5/2017
 */
public class TicTacToe implements ITicTacToe {
		 
	   // The game board and the game status
	   private static final int ROWS = 3, COLS = 3; // number of rows and columns
	   private int[][] board = new int[ROWS][COLS]; // game board in 2D array
	   private int sumX, sumY,sumXY = 0;
	   public static Scanner in = new Scanner(System.in);
	   int playerOne,computer;
	/**
	 * clear board and set current player   
	 */
	public TicTacToe(){
		
	}
	
	public void setPlayers(String playerInput) {
		if(playerInput.toUpperCase().equals("X")) {
			playerOne 	= CROSS;
			computer 	= NOUGHT;
		}else {
			playerOne 	= NOUGHT;
			computer 	= CROSS;	 
		}
	}
	public int getPlayerOne() {
		return playerOne;
	}
	
	public int getComputer() {
		return computer;
	}
	@Override
	public void clearBoard() {
		board = new int[ROWS][COLS];

	}

	@Override
	public void setMove(int location) {
		//switch statement that takes the location and places the players
		//selected value in the array at that locaiton.
		switch(location){
		case 0: if(board[0][0] == EMPTY) {board[0][0] = getPlayerOne();} 
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 1: if(board[0][1] == EMPTY) {board[0][1] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 2: if(board[0][2] == EMPTY) {board[0][2] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 3: if(board[1][0] == EMPTY) {board[1][0] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 4: if(board[1][1] == EMPTY) {board[1][1] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 5: if(board[1][2] == EMPTY) {board[1][2] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 6: if(board[2][0] == EMPTY) {board[2][0] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 7: if(board[2][1] == EMPTY) {board[2][1] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		case 8: if(board[2][2] == EMPTY) {board[2][2] = getPlayerOne();}
				else{System.out.println("That Spot is taken please try again"); String userInput = in.next(); setMove(Integer.parseInt(userInput));};
				break;
		}

	}

	//method to get computer move, gets the row and and column the user
	// just played and then attempts to play based on that knowledge
	@Override
	public void setComputerMove(int playerMove) {
		
		switch(playerMove) {
		case 0: if	   (board[0][1] == EMPTY) 	{board[0][1] = getComputer();}
				else if(board[1][0] == EMPTY) 	{board[1][0] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();};
		break;
		case 1: if	   (board[0][2] == EMPTY) 	{board[0][2] = getComputer();}
				else if(board[1][1] == EMPTY) 	{board[1][1] = getComputer();}
				else if(board[0][0] == EMPTY)	{board[0][0] = getComputer();};
		break;
		case 2: if	   (board[0][1] == EMPTY) 	{board[0][1] = getComputer();}
				else if(board[1][2] == EMPTY) 	{board[1][2] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();};
		break;
		case 3: if	   (board[0][0] == EMPTY) 	{board[0][0] = getComputer();}
				else if(board[2][0] == EMPTY) 	{board[2][0] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();};
		break;
		case 4: if	   (board[0][1] == EMPTY) 	{board[0][1] = getComputer();}
				else if(board[1][0] == EMPTY) 	{board[1][0] = getComputer();}
				else if(board[1][2] == EMPTY)	{board[1][2] = getComputer();}
				else if(board[2][1] == EMPTY)	{board[2][1] = getComputer();};
		break;
		case 5: if	   (board[0][2] == EMPTY) 	{board[0][2] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();}
				else if(board[2][2] == EMPTY) 	{board[2][2] = getComputer();};
		break;
		case 6: if	   (board[1][0] == EMPTY) 	{board[1][0] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();}
				else if(board[2][1] == EMPTY) 	{board[2][1] = getComputer();};
		break;
		case 7: if	   (board[2][0] == EMPTY) 	{board[2][0] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();}
				else if(board[2][2] == EMPTY) 	{board[2][2] = getComputer();};
		break;
		case 8: if	   (board[1][2] == EMPTY) 	{board[1][2] = getComputer();}
				else if(board[2][1] == EMPTY) 	{board[2][1] = getComputer();}
				else if(board[1][1] == EMPTY)	{board[1][1] = getComputer();};
		break;
		}
	}

	@Override
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
		return winner;
	}
	
	  /**
	   *  Print the game board 
	   */
	   public  void printBoard() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            printCell(board[row][col]); // print each of the cells
	            if (col != COLS - 1) {
	               System.out.print("|");   // print vertical partition
	            }
	         }
	         System.out.println();
	         if (row != ROWS - 1) {
	            System.out.println("-----------"); // print horizontal partition
	         }
	      }
	      System.out.println();
	   }
	 
	   /**
	    * Print a cell with the specified "content" 
	    * @param content either CROSS, NOUGHT or EMPTY
	    */
	   public  void printCell(int content) {
	      switch (content) {
	         case EMPTY:  System.out.print("   "); break;
	         case NOUGHT: System.out.print(" O "); break;
	         case CROSS:  System.out.print(" X "); break;
	      }
	   }
	   
	   public int getRow(int move) {
		   if(move >= 0 && move <= 2) {
			   return 0;
		   }
		   else if(move >= 3 && move <= 5) {
			   return 1;
		   }
		   else if(move >= 6 && move <= 8) {
			   return 2;
		   }
		   else {
		   return -1;
		   }
	   }
	   
	   public int getCol(int move) {
		   if	  (move == 0 || move == 3 || move == 6) {
			   return 0;
		   }
		   else if(move == 1 || move == 4 || move == 7) {
			   return 1;
		   }
		   else if(move == 2 || move == 5 || move == 8) {
			   return 2;
		   }
		   else {
		   return -1;
		   }
	   }

}
