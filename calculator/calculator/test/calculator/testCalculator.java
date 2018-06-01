//testCalculator

package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sushma
 */
public class testCalculator {
    Operations o;
    public testCalculator() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        o=new Operations();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testAddition() {
     
         assertEquals(2,o.add(1,1),0.0001);
     }
     @Test
     public void testMultiplication() {
     
         assertEquals(1,o.multiply(1,1),0.0001);
     }
     @Test
     public void testSubtraction() {
     
         assertEquals(0,o.subtract(1,1),0.0001);
     }
     @Test
     public void testDivision() {
     
         assertEquals(1,o.divide(1,1),0.0001);
     }
}
