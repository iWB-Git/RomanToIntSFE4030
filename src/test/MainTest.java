import org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void reducedInput(){
        Main ri=new Main();
        assertEquals(4,ri.romanToInt("IV"));
        assertEquals(9,ri.romanToInt("IX"));
        assertEquals(950,ri.romanToInt("LM"));


    }
    @Test
    public void singularInput(){
        Main ri=new Main();
        assertEquals(1,ri.romanToInt("I"));
        assertEquals(5,ri.romanToInt("V"));
        assertEquals(10,ri.romanToInt("X"));
        assertEquals(50,ri.romanToInt("L"));
        assertEquals(100,ri.romanToInt("C"));
        assertEquals(500,ri.romanToInt("D"));
        assertEquals(1000,ri.romanToInt("M"));

    }
    @Test
    public void invalidInput(){
        Main ri=new Main();
        assertEquals(-1,ri.romanToInt(""));
        assertEquals(-1,ri.romanToInt("Y"));


    }
}