package pl.b2b;

import org.junit.Before;
import org.junit.Test;
import pl.b2b.Start.Start;

import static org.junit.Assert.*;

public class StartTest {

    private Start start;

    @Before
    public void init() {
        start = new Start();
    }

    @Test
    public void getName() {
        assertEquals("Kuba", start.getName("Kuba"));
    }


    @Test
    public void getNameAndSurname() {
        assertEquals("Kuba Czajkowski", start.getNameAndSurname("Kuba", "Czajkowski"));
    }
    @Test
    public void plus() {
        assertEquals(5, start.plus(3,2));
    }
    @Test
    public void minus() {
        assertEquals(2, start.minus(3,1));
    }
    @Test
    public void multiplication() {
        assertEquals(8, start.multiplication(2,4));
    }
    @Test
    public void division() {
        assertEquals(2, start.division(8,4));
    }

    @Test
    public void ageNameSurname() {
        assertEquals("30 Kuba Czajkowski", start.ageNameSurname(30, start.getNameAndSurname("Kuba", "Czajkowski")));
    }

}