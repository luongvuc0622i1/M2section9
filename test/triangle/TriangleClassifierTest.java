package triangle;

import nextDayCalculator.NextDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("case-2-2-2")
    void case_2_2_2() {
        int side1 =2;
        int side2 =2;
        int side3 =2;
        String expected = "tam giác thường";

        String result = TriangleClassifier.getTriangleName(side1, side2, side3);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case-2-2-3")
    void case_2_2_3() {
        int side1 =2;
        int side2 =2;
        int side3 =3;
        String expected = "tam giác thường";

        String result = TriangleClassifier.getTriangleName(side1, side2, side3);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case-3-4-5")
    void case_3_4_5() {
        int side1 =3;
        int side2 =4;
        int side3 =5;
        String expected = "tam giác thường";

        String result = TriangleClassifier.getTriangleName(side1, side2, side3);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case-8-2-3")
    void case_8_2_3() {
        int side1 =8;
        int side2 =2;
        int side3 =3;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.getTriangleName(side1, side2, side3);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case-1-2-1")
    void case_1_2_1() {
        int side1 =-1;
        int side2 =2;
        int side3 =1;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.getTriangleName(side1, side2, side3);

        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case-0-1-1")
    void case_0_1_1() {
        int side1 =0;
        int side2 =1;
        int side3 =1;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.getTriangleName(side1, side2, side3);

        assertEquals(expected, result);
    }
}