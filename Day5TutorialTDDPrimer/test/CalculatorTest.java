/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import day5tutorialtddprimer.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CalculatorTest {
    
    private Calculator calc;
    
    @Before
    public  void initialiseTest() {
        calc = new Calculator();
    }
    public void CalculatorTest() {
    }
    @Test
    public void testAdd() {
    int expected = 20;
    int actual = calc.add(17,3);
    assertEquals(expected, actual, 0);
    }
    public void testSubtract() {
    int expected = 20;
    int actual = calc.add(25,5);
    assertEquals(expected, actual, 0);
    }
}
