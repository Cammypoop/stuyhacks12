import java.util.*;
import java.io.*;
public class Grid{
    private Cell[][] field;
    boolean live;
    int totalBombs;
    //ask user for difficulty
    // easy : 9x9, 10 mines
    // medium: 16x16, 40 mines
    // hard : 30x16, 99 mines 
    // if this boolean is false terminate program
    public Grid(String difficulty){
        if (difficulty.equals("easy")){
            this(10, 9, 9);
        }
        else if (difficulty.equals("medium")){
            this(40, 16, 16);
        }
        else if (difficulty.equals("hard")){
            this(99, 30, 16);
        }
    }
    public Grid(int bombs, int r, int c){
        int totalBombs = bombs;
        live = true;
        field = new Cell[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                field[i][j] = new Cell(false);
            }
        }
        fieldgenerator(bombs);
    }

    public void fieldgenerator(int bombs){
        while(bombs > 0){
            int r = (int) (Math.random() * field.length);
            // System.out.println(field.length); // debug
            int c = (int) (Math.random() * field[0].length);
            Cell selectedCell = get(r,c);
            if (!selectedCell.getIsMine()){
                selectedCell.setMine(true);
            }
            else{
                continue;
            }
            bombs--;
            // System.out.println(toString()); // Debug
        }
    }
    public void calculateNumMines(){
        for (int i = 0; i < field.length; i++){ 
            for (int j = 0; j < field[0].length; j++){
                if (field[i][j].getIsMine()){
                    continue;
                }
                int numMines = 0;
                for (int k = i-1; k <= i+1; k++){
                    for (int l = j-1; l <= j+1; l++){
                        if (k >= 0 && l >= 0 && k < field.length && l < field[0].length && field[k][l].getIsMine()){
                            numMines++;
                        }
                    }
                }
                field[i][j].setNumMines(numMines);
            }
        }
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[0].length; j++){
                s += " " + field[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public void reveal(int r, int c){
        field[r][c].setRevealed(true);
        if (field[r][c].getIsMine()){
            live = false;
            // lose();
        }
    }

    //accessor methods

    public boolean getLive(){
        return live;
    }

    public Cell get(int r, int c){
        return field[r][c];
    }

}