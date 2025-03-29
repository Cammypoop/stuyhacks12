public class Cell {
    private boolean isMine;
    private int numMines;
    private boolean flagged;

    public Cell(boolean isMine){
        this.isMine = isMine;
    }

    public String toString() {
        if (isMine) {
            return "*";
        } else if (flagged) {
            return "F";
        } else if (numMines > 0) {
            return Integer.toString(numMines);
        } else {
            return " ";
        }
    }

    public int getNumMines() {
        return numMines;
    }
    public boolean getIsMine(){
        return isMine;
    }

    public boolean getFlagged(){
        return flagged;
    }

    public void setFlagged(boolean flagged){
        this.flagged = flagged;
    }
    public void setMine(boolean isMine) {
        this.isMine = isMine;
    }
    public void setNumMines(int newMines){
        this.numMines = newMines;
    }
}
