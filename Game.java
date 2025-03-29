import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper!");
        System.out.println("Enter the difficulty you would like to play: easy, medium or hard");
        String difficulty = scan.nextLine();
        Grid g = new Grid(difficulty);
    }
}
