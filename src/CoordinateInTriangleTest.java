import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateInTriangleTest {

    @Test
    void negativeTest() {
        boolean test = CoordinateInTriangle.IsCordInTriangle(30,6, 6,4,3,7,1,5);
        assertFalse(test);
    }

    @Test
    void isInTriangle2() {
        boolean test= CoordinateInTriangle.IsCordInTriangle(3,6, 6,4,3,7,1,5);
        assertTrue(test);
        //System.out.println(test);
    }

    @Test
    void negativeTest2 () {
        boolean test = CoordinateInTriangle.IsCordInTriangle(-100,60, 5,4,90,100,70,6);
        assertFalse(test);

    }

    @Test
    void onPerimeter () {
        boolean test = CoordinateInTriangle.IsCordInTriangle(3,1.5, 1,1,5,5,5,2);
        assertTrue(test);

    }
}