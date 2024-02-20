package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void calcularPalindromo() {
        assertAll(
                () -> assertTrue(new Palindromo("radar").calcularPalindromo(), "radar"),
                () -> assertTrue(new Palindromo("level").calcularPalindromo(),"level"),
                () -> assertTrue(new Palindromo("deified").calcularPalindromo(), "deified"),
                () -> assertTrue(new Palindromo("Able was I ere I saw Elba").calcularPalindromo(), "Able was I ere I saw Elba"),
                () -> assertFalse(new Palindromo("hello").calcularPalindromo(), "hello"),
                () -> assertFalse(new Palindromo("world").calcularPalindromo(), "world"),
                () -> assertFalse(new Palindromo("notpalindrome").calcularPalindromo(), "notpalindrome")
        );
    }
}