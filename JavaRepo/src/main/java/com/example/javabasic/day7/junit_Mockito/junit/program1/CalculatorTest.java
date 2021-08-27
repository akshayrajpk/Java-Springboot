package com.example.javabasic.day7.junit_Mockito.junit.program1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() throws Exception {
        calculator = new Calculator();
    }
    @Test
    public void testMultiply_whenProperInputPassed_returnResult(){
        assertEquals(60,calculator.multiply(6,10));

        // Expected Result = 60
        //Actual Input 6,10 -> Actual 60
        // assertEquals(<DEVELOPER_EXPECTED_OUTPUT>, <ACTULA_INPUT>)

    }

    @RepeatedTest(15)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        Assumptions.assumeFalse(System.getProperty("os.name").contains("Linux"));
        assertEquals(calculator.multiply(0, 5), 0, "Multiple with zero should be zero");
        assertEquals(calculator.multiply(5, 0), 0, "Multiple with zero should be zero");
    }
}
