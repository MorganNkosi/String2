import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalcTest {

    private StringCalc calc;

    @BeforeEach
    void init()
    {
        calc = new StringCalc();
    }

    @Test
    void add() throws Exception {
        assertEquals(StringCalc.Add("//***\n1000,2***3"),5);
    }

    @Test
    void except() throws Exception {
        assertThrows(IllegalArgumentException.class, ()-> StringCalc.Add("-3,5"));
    }


}