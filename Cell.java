public class Cell {
    private boolean isMine;
    private int numMines;
    private boolean flagged;
    private boolean revealed;

    public Cell(boolean isMine) {
        this.isMine = isMine;
    }

    public String debugToString() {
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

    public String toString() {
        if (revealed) {
            if (isMine) {
                return "*";
            } else if (flagged) {
                return "F";
            } else if (numMines > 0) {
                return Integer.toString(numMines);
            } else {
                return " ";
            }
        } else {
            return "\\";
        }
    }

    public int getNumMines() {
        return numMines;
    }

    public boolean getIsMine() {
        return isMine;
    }

    public boolean getFlagged() {
        return flagged;
    }

    public boolean getRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public void setMine(boolean isMine) {
        this.isMine = isMine;
    }

    public void setNumMines(int newMines) {
        this.numMines = newMines;
    }
}
