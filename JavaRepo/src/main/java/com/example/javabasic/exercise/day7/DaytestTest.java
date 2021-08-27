package com.example.javabasic.exercise.day7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaytestTest {
    private DaytestExercise dattest;
    private  AddressExercise addr;

    @BeforeEach
    void setUp() throws Exception{
        dattest = new DaytestExercise();
        addr = new AddressExercise("John","Doe");
    }

    @Test
    public void test_calculate(){
        assertEquals(6,dattest.calculate(3,2));
    }

    @RepeatedTest(15)
    @DisplayName("Ensure correct handling of zero")
    void calc_with_zero(){
        assertEquals(dattest.calculate(0,10),0,"Multiply with 0");
    }

    @Test
    @DisplayName("Name Test")
    void nameDisp(){
        assertAll("ad Name",
                () -> assertEquals("John",addr.getFirstName()),
                () -> assertEquals("Doe",addr.getLastName())
        );
    }
}
