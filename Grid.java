import java.util.*;
import java.io.*;
public class Grid{
    public Cell[][] field;
    //ask user for difficulty
    // easy : 9x9, 10 mines
    // intermediate : 16x16, 40 mines
    // expert : 30x16, 99 mines 
    boolean live = true;
    // if this boolean is false terminate program
    public Grid(int bombs, int x, int y){
        field = new Cell[x][y];
        fieldgenerator(bombs);
    }

    public void fieldgenerator(int bombs){
        while(bombs > 0){
            field.get(Math.random()*length(), Math.random()*field[0].length).setBomb();
        }
    }

    //accessor methods

    public Cell get(int x, int y){
        return field[x][y];
    }
    public int length(){
        return field.length;
    }

}