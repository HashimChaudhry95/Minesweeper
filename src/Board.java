import java.util.Random;
import java.lang.Math;


public class Board {
    //Attributes
    Tile [][] board;
    int boardSize;
    int numOfMines;
    int numofTilesFlagged;

    //Constructor
    public Board (int boardSize){
        this.boardSize = boardSize;
        this.board = new Tile[boardSize][boardSize];
        this.numOfMines = (int)((boardSize * boardSize)/10);
    setTiles();
        //set the bombs here//
        //set the bomb counters//
        //start game//
    }


    //Method

    public void makeBoard(){
        Tile[][] board;
        board = new Tile[boardSize][boardSize];
    }
    public void setTiles() {

        for(int i=0; i<boardSize; i++){
            System.out.println();
         for(int j=0; j<boardSize; j++){
         board[i][j] = new Tile();
             System.out.print(board[i][j] + " ");
        }}


        }
    public void DistributeBombs(Tile[][] board) {
        for(int i =0; i< this.numOfMines; i++){
        }

            int X = (int)(Math.random() * boardSize);
            int Y = (int)(Math.random() * boardSize);
            while (board[X][Y]).getBomb();
        {
            X = (int)(Math.random() * boardSize);
            Y = (int)(Math.random() * boardSize);
        }
        board[X][Y].setBomb(true);
        }







};



    //public void setBombCounter() {};

           // }//
