package dev.sudohub.nau;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */ 
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void TestElements(){
        TestElements.main(null);
    }
    @Test
    public void TestModifiers(){
        TestModificators.main(null);
    }
    @Test
    public void TestNewClass(){
        NewClass.main(null);
    }
    @Test
    public void TestPolymorphism(){
        PolymorphismTest.main(null);
    }
}
