/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Blank47
 */
public class MainTest {
    
    public MainTest() {
    }

    

    @Test
    public void testCountOfGreater() {
        System.out.println("countOfGreater");
        int[] Array1 = null;
        int checkingNumber = 0;
        int expResult = 4;
        int result = Main.countOfGreater(Array1, checkingNumber);
        assertEquals(expResult, result);
        
    }
    
}
