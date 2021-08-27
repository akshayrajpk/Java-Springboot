package com.example.javabasic.day7.junit_Mockito.mockito.program1;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner.class)

class ServiceTest {

    @Mock
    Database databaseMock;
   /* @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }*/
    @Test
    public void testQuery()  {
        assertNotNull(databaseMock);
        when(databaseMock.isAvailable()).thenReturn(true);  
        Service t  = new Service(databaseMock);             
        boolean check = t.query("* from t");                
        assertTrue(check);
    }
}
