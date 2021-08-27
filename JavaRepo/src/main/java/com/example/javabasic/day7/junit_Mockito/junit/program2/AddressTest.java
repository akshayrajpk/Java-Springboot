package com.example.javabasic.day7.junit_Mockito.junit.program2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    private Address address;

    @BeforeEach
    void setUp() {
        address = new Address();
    }

    @Test
    @DisplayName("Passing Blank Address Object. Test will Fail")
    public void groupedAssertions_FAILED() {
        Address address = new Address();

        assertAll("address name",
                () -> assertEquals("John", address.getFirstName()),
                () -> assertEquals("User", address.getLastName())
        );
    }

    @Test
    @DisplayName("Passing correct Address Object. Test will Pass")
    public void groupedAssertions_PASSED() {
        Address address = new Address("John","User");

        assertAll("address name",
                () -> assertEquals("John", address.getFirstName()),
                () -> assertEquals("User", address.getLastName())
        );
    }
}
