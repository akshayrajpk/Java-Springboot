package com.example.javabasic.exercise.day8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    private Arithmetic arithmetic;

    @BeforeEach
    public void setUp() throws Exception {
        arithmetic = new Arithmetic();
    }

    @Test
    @DisplayName("Arithmetic Test")
    void arTest(){
        assertAll("AR Test",
            () -> assertEquals(4,arithmetic.add(2,2)),
            () -> assertEquals(9,arithmetic.mul(3,3)),
            () -> assertEquals(2,arithmetic.div(4,2)),
            () -> assertEquals(1,arithmetic.sub(5,4))
        );
    }

}
