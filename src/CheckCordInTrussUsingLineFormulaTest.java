import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCordInTrussUsingLineFormulaTest {
    @Test
    void positiveTest() {
        boolean test = CheckCordInTrussUsingLineFormula.check_Using_lines(150, 150);
        assertTrue(test);
    }
    @ Test
    void positiveTest2() {
        boolean test = CheckCordInTrussUsingLineFormula.check_Using_lines(200, 175);
        assertTrue(test);
    }
    @ Test
    void negativeTest() {
        boolean test = CheckCordInTrussUsingLineFormula.check_Using_lines(200, 100);
        assertFalse(test);
    }


}