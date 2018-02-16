import java.util.Scanner;
/**
 * Tic-Tac-Toe: Two-player console, non-graphics
 * @author relkharboutly
 * @date 1/5/2017
 */
public class TTTConsole  {
                                                     
      public static Scanner in = new Scanner(System.in); // the input Scanner
 
   public static TicTacToe TTTboard = new TicTacToe();
   /** The entry main method (the program starts here) */
   public static void main(String[] args) {
	   int currentState = TicTacToe.PLAYING;
	   String userInput = null;
	String userPlayerChoice;
	   //game loop
       System.out.println("Select Player (X or O)");
       userPlayerChoice = in.next();
       TTTboard.setPlayers(userPlayerChoice);
	   do {
         TTTboard.printBoard();
         // Print message if game-over
         currentState = TTTboard.checkForWinner();
         /**
          * get player input here and call setMove(). user should input a number between 0-8
          */
         
         if (currentState == ITicTacToe.CROSS_WON) {
            System.out.println("'X' won! Bye!");
         } else if (currentState == ITicTacToe.NOUGHT_WON) {
            System.out.println("'O' won! Bye!");
         } else if (currentState == ITicTacToe.TIE) {
            System.out.println("It's a TIE! Bye!");
         }
         if (currentState == ITicTacToe.PLAYING) {
        	//user can break the loop. remove this line when you finish implementation.
        	System.out.println("Enter your Move (0-8)");
         	userInput = in.next();
         	TTTboard.setMove(Integer.parseInt(userInput));
         	System.out.println(TTTboard.getComputer() + " : Computer Move");
         	TTTboard.setComputerMove(Integer.parseInt(userInput));
         }
         
      } while ((currentState == ITicTacToe.PLAYING) && (!userInput.equals("q"))); // repeat if not game-over
   }
 
     
}