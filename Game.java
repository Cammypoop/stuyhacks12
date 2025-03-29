import java.util.*;
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
    String input="";
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to Minesweeper!");
    while(!(input.equalsIgnoreCase("easy") || input.equalsIgnoreCase("intermediate") || input.equalsIgnoreCase("expert"))){
        System.out.println("Enter the difficulty you would like to play: easy, intermediate, expert");
        input = userInput(in);
    }
    Grid grid = new Grid(input);
    while (grid.getLive()){
        System.out.println(grid.toString());
        System.out.println("Make a move: ");
        input = userInput(in);
        String[] inputArr = input.split(" ");
        if (inputArr[0].equals("flag") || inputArr[0].equals("f")){
            grid.get(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])).setFlagged(true);
        } else if (inputArr[0].equals("reveal") || inputArr[0].equals("r")){
            grid.reveal(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
        }
    }
    
    

  }
}
