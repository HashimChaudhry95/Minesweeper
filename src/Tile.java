public class Tile {
    //Attributes


    private int bombCounter;
    private boolean tileRevealed;
    private boolean isMine;
    private boolean flagged;



    //Constructor
    public Tile(){
        this.tileRevealed = false;
        this.isMine = false;
        this.flagged = false;
    }

    //Methods

    public void setBombCounter(int nearbyBombs){
        this.bombCounter = nearbyBombs;}


    public int getBombCounter(){
        return bombCounter;

        }
    public void setBomb(boolean Mine){
        this.isMine = true;}

    public boolean getBomb(){
        return isMine;
    }
    public void setFlagged(){
        this.flagged = !this.flagged;
    }
    public boolean getFlagged(){
        return  this.flagged;
    }
    public boolean getRevealed(){
        return tileRevealed;
    }
    public void setRevealed(boolean revealed){
        this.tileRevealed = tileRevealed;
    }

        }




