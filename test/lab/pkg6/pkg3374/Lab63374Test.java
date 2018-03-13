/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.pkg3374;

import static lab.pkg6.pkg3374.Lab63374.createBoard;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scoob
 */
public class Lab63374Test {
    
       char[][] board = createBoard();
    
    public Lab63374Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createBoard method, of class Lab63374.
     */
    //Check if board is full
    @Test
    public void test9Fields() {
        System.out.println("9 Fields");
        Lab63374 instance = new Lab63374();
        char[][] temp = instance.createBoard();
        
        temp[0][0] = instance.CurrentPlayer();
        instance.ChangePlayer();
        temp[0][1] = instance.CurrentPlayer();
        instance.ChangePlayer();
        temp[0][2] = instance.CurrentPlayer();
        instance.ChangePlayer();
        
        temp[1][0] = instance.CurrentPlayer();
        instance.ChangePlayer();
        temp[1][1] = instance.CurrentPlayer();
        instance.ChangePlayer();
        temp[1][2] = instance.CurrentPlayer();
        
        temp[2][0] = instance.CurrentPlayer();
        instance.ChangePlayer();
        temp[2][1] = instance.CurrentPlayer();
        instance.ChangePlayer();
        temp[2][2] = instance.CurrentPlayer();
        instance.ChangePlayer();
        
        char[][] expResult = new char[3][3];
        boolean result = instance.BoardFull(temp);
        assertTrue(result);

    }

    /**
     * Test of CurrentPlayer method, of class Lab63374.
     */
    @Test
    //test current player is x
    public void testCurrentPlayerX() {
        System.out.println("CurrentPlayer X");
        Lab63374 instance = new Lab63374();
        instance.createBoard();
        char expResult = 'x';
        char result = instance.CurrentPlayer();
        assertEquals(expResult, result);

    }
    
    @Test
    public void testCurrentPlayerO() {
        System.out.println("CurrentPlayer Y");
        Lab63374 instance = new Lab63374();
        instance.createBoard();
        
        char expResult = 'o';
        char result = instance.ChangePlayer();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeMoveX()
    {
        System.out.println("Make Move X");
        Lab63374 instance = new Lab63374();
        char[][] temp = instance.createBoard();
        int xCord = 2;
        int yCord = 2;
        temp[xCord][yCord] = instance.CurrentPlayer();
        
        
        boolean expResult = true;
        boolean result = instance.SpaceInUse(temp, xCord, yCord);
        assertTrue(result);
    }
    
    @Test
    public void testMakeMoveO()
    {
        System.out.println("Make Move O");
        Lab63374 instance = new Lab63374();
        char[][] temp = instance.createBoard();
        instance.ChangePlayer();
        int xCord = 2;
        int yCord = 2;
        temp[xCord][yCord] = instance.CurrentPlayer();
        boolean expResult = true;
        boolean result = instance.SpaceInUse(board,xCord, yCord);
        
        assertTrue(result);
        
    }
    
    @Test
    public void testPlacement(){
        System.out.println("Check if space is in use");
        Lab63374 instance = new Lab63374();
        char[][] temp = instance.createBoard();
        int xCord = 1;
        int yCord = 1;
        boolean expResult = true;
        boolean result = instance.SpaceInUse(temp,xCord,yCord);
        
        assertTrue(result);
        //instance.MakeMove(0, 0);
    }
    


    
}
