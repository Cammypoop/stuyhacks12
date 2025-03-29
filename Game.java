import java.util.*;

import org.w3c.dom.Text;
public class Game {
    public static void main(String[] args) {
        run();
    }

    public static String userInput(Scanner in){
      //Move cursor to prompt location

    //   Text.go(29, 65);
    //   //show cursor
    //   Text.showCursor();
      String input = in.nextLine();
    //   Grid grid;

      //clear the text that was written
      //Text.clear();
      return input;

  }

  public static void run(){
    String input = "";
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Minesweeper!");
    while(!(input.equalsIgnoreCase("easy") || input.equalsIgnoreCase("intermediate") || input.equalsIgnoreCase("expert"))){
        System.out.println("Enter the difficulty you would like to play: easy, intermediate, expert");
        input = userInput(in);
    }
    Grid grid = new Grid(input);
    System.out.println("Make a move: ");
    

  }
}
