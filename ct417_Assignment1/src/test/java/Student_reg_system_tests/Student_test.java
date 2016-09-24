/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_reg_system_tests;

import Student_reg_system.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eoin
 */
public class Student_test {
    
    
    @Test
    public void getUsername_check(){
        Student s = new Student("Eoin Clancy",21,"03/07/1995","4BP");
        String expected = "Eoin_Clancy_21";
        assertEquals(expected, s.getUsername());
    }
    
    public Student_test() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
