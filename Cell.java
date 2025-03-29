public class Cell {
    private boolean isMine;
    private int numMines;

    public Cell(boolean isMine){
        this.isMine = isMine;
    }

    public int getNumMines() {
        return numMines;
    }
    public boolean getIsMine(){
        return isMine;
    }
    public void setMine(boolean isMine) {
        this.isMine = isMine;
    }
    public void setNumMines(int newMines){
        this.numMines = numMines;
    }
}
