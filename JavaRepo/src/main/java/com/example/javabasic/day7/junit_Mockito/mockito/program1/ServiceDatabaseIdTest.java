package com.example.javabasic.day7.junit_Mockito.mockito.program1;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServiceDatabaseIdTest {

    @Mock
    Database databaseMock;

    @Test
    public void ensureMockitoReturnsTheConfiguredValue() {

        // define return value for method getUniqueId()
        Mockito.when(databaseMock.getUniqueId()).thenReturn(42);
        //when(databaseMock.getUniqueId()).thenReturn(42); //Assertion Error

        Service service = new Service(databaseMock);
        // use mock in test....
        assertEquals(service.toString(), "Using database with id: 42");
    }

}
