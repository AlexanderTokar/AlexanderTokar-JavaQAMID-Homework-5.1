package ru.netology.sqr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SqrService;

import static org.junit.jupiter.api.Assertions.*;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2,101,145",
            "3,101,169"
    })
    public void validLimitsValues (int expected, int lowerValue, int upperValue) {
        SqrService service = new SqrService();
        // int lowerValue = 101;
        // int upperValue = 145;
        // int expected = 2;

        int actual = service.sqrCalc(lowerValue,upperValue);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0,99",
            "0,9802,10000"
    })
    public void unValidLimitsValues (int expected, int lowerValue, int upperValue) {
        SqrService service = new SqrService();
       // int lowerValue = 99;
       // int upperValue = 0;
       // int expected = 0;

        int actual = service.sqrCalc(lowerValue,upperValue);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,100,105",
            "1,9790,9801"
    })
    public void boundaryValues (int expected, int lowerValue, int upperValue) {
        SqrService service = new SqrService();
        // int lowerValue = 100;
        // int upperValue = 105;
        // int expected = 1;

        int actual = service.sqrCalc(lowerValue,upperValue);
        assertEquals(expected,actual);
    }
}
