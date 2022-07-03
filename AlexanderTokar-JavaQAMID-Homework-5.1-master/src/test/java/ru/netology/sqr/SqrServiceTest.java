package ru.netology.sqr;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2,101,145",
            "3,101,169"
    })
    public void shouldCalcSqrInsideValidLimitsValues (int expected, int lowerValue, int upperValue) {
        SqrService service = new SqrService();

        int actual = service.sqrCalc(lowerValue,upperValue);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0,99",
            "0,9802,10000"
    })
    public void shouldCalcSqrInsideUnValidLimitsValues (int expected, int lowerValue, int upperValue) {
        SqrService service = new SqrService();

        int actual = service.sqrCalc(lowerValue,upperValue);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,100,105",
            "1,9790,9801"
    })
    public void shouldCalcSqrInBoundaryValues (int expected, int lowerValue, int upperValue) {
        SqrService service = new SqrService();

        int actual = service.sqrCalc(lowerValue,upperValue);
        assertEquals(expected,actual);
    }
}
