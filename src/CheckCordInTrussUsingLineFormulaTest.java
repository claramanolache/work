import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCordInTrussUsingLineFormulaTest {
    @Test
    void left_positiveTest() {
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(150, 150);
        assertTrue(test);
    }
    @ Test
    void left_positiveTest2() {
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(200, 175);
        assertTrue(test);
    }
    @ Test
    void left_negativeTest() {
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(200, 100);
        assertFalse(test);
    }

    @Test
    void right_positiveTest() {
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(450,200);
        assertTrue(test);
    }

    @Test
    void right_negativeTest() {
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(450,350);
        assertFalse(test);
    }

    @Test
    void inside_small_left_triangle(){
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(225,225);
        assertFalse(test);
    }

    @Test
    void inside_small_bottom_left_triangle(){
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(230,105);
        assertFalse(test);
    }

    @Test
    void inside_small_top_right_triangle(){
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(425,220);
        assertFalse(test);
    }

    @Test
    void inside_small_bottom_right_triangle(){
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(421,100);
        assertFalse(test);
    }

    @Test
    void on_perimeter(){
        boolean test = CheckCordInTrussUsingLineFormula.in_truss(473,199.51);
        assertTrue(test);
    }
}