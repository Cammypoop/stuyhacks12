import java.util.*;
import java.io.*;
public class Grid{
    private Cell[][] field;
    //ask user for difficulty
    // easy : 9x9, 10 mines
    // intermediate : 16x16, 40 mines
    // expert : 30x16, 99 mines 
    boolean live = true;
    // if this boolean is false terminate program
    public Grid(int bombs, int r, int c){
        field = new Cell[r][c];
        fieldgenerator(bombs);
    }

    public void fieldgenerator(int bombs){
        while(bombs > 0){
            int x = (int) Math.random() * field.length;
            int y = (int) Math.random() * field[0].length;
            
            get(x,y).setMine(true);
            bombs--;
        }
    }

    //accessor methods

    private Cell get(int r, int c){
        return field[r][c];
    }

}