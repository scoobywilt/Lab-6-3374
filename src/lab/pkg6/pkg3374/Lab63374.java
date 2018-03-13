/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.pkg3374;
import java.util.*;

/**
 *
 * @author scoob
 */
public class Lab63374 
{

    int turn = 1;
    //public char board[][];
    
    public static char[][] createBoard()
    {
        char[][] board = new char[3][3];
        return board;
    }
    
    public char CurrentPlayer()
    {
        char x = 'x';
        char o = 'o';
        if(turn % 2 == 1){
            return x;
        }
        if(turn % 2 == 0){
            return o;
        }
        else{
            return x;
        }
     
    }
    
    public char ChangePlayer(){
        turn++;
        return CurrentPlayer();
    }
    
    public void MakeMove(char[][] board, int row, int col)
    {
        while(turn < 9)
        {
            if (SpaceInUse(board,row,col) == false) 
            {
                board[row][col] = (CurrentPlayer());
                turn++;
            }
            
        }
        
    }
    
    public boolean SpaceInUse(char[][] board, int row, int col){
        if(board[row][col] != 'x' || board[row][col] != 'o'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean BoardFull(char[][] board) 
    {
        for (int row = 0; row < 3; ++row) 
        {
            for (int column = 0; column < 3; ++column) 
            {
                if (board[row][column] == 0) {
                    // a move still exists - board is not full
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        char[][] newBoard = createBoard();
        

    }
    
}
