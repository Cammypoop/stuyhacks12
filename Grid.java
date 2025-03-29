import java.util.*;
import java.io.*;
public class Grid{
    private Cell[][] field;
    boolean live;
    //ask user for difficulty
    // easy : 9x9, 10 mines
    // intermediate : 16x16, 40 mines
    // expert : 30x16, 99 mines 
    // if this boolean is false terminate program
    public Grid(int bombs, int r, int c){
        live = true;
        field = new Cell[r][c];
        fieldgenerator(bombs);
    }

    public void fieldgenerator(int bombs){
        while(bombs > 0){
            int r = (int) Math.random() * field.length;
            int c = (int) Math.random() * field[0].length;
            Cell selectedCell = get(r,c);
            if (selectedCell.getIsMine()){
                selectedCell.setMine(true);
            }
            bombs--;
        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                s += field[i][j];
            }
            s += "\n";
        }
        return s;
    }

    //accessor methods

    private Cell get(int r, int c){
        return field[r][c];
    }

}