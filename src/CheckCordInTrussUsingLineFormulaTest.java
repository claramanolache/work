import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCordInTrussUsingLineFormulaTest {
    @Test
    void left_positiveTest() {
        boolean test = CheckCordInTrussUsingLineFormula.check_Using_lines(150, 150);
        assertTrue(test);
    }
    @ Test
    void left_positiveTest2() {
        boolean test = CheckCordInTrussUsingLineFormula.check_Using_lines(200, 175);
        assertTrue(test);
    }
    @ Test
    void left_negativeTest() {
        boolean test = CheckCordInTrussUsingLineFormula.check_Using_lines(200, 100);
        assertFalse(test);
    }

    @Test
    void right_positiveTest() {
        boolean test = CheckCordInTrussUsingLineFormula.left_check_Using_lines(450,200);
        assertTrue(test);
    }

    @Test
    void right_negativeTest() {
        boolean test = CheckCordInTrussUsingLineFormula.left_check_Using_lines(450,350);
        assertFalse(test);
    }


}