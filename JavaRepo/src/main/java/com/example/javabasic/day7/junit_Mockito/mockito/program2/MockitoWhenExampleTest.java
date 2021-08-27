package com.example.javabasic.day7.junit_Mockito.mockito.program2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;

import java.util.Iterator;
import java.util.Properties;

import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class MockitoWhenExampleTest {

    @Mock
    Iterator<String> i;
    @Mock
    Comparable<String> c;

    @BeforeEach
    void initializeService() {
        c = "Mockito";
        // Do whatever kind of initialization the policy service requires
    }

    // demonstrates the return of multiple values
    @Test
    public void testMoreThanOneReturnValue() {
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result = i.next() + " " + i.next();
        // assert
        assertEquals("Mockito rocks", result);
    }

    @Test
    public void testMockitoThrows() {
        Properties properties = new Properties();

        Properties spyProperties = spy(properties);

        doReturn("42").when(spyProperties).get("shoeSize");

        String value = (String) spyProperties.get("shoeSize");

        assertEquals("42", value);
    }

}
