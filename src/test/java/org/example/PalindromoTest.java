package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    @Test
    void esPalindromo_radar() {
        assertTrue(new Palindromo("radar").calcularPalindromo());
    }
    @Test
    void esPalindromo_level() {
        assertTrue(new Palindromo("level").calcularPalindromo());
    }
    @Test
    void esPalindromo_deified() {
        assertTrue(new Palindromo("deified").calcularPalindromo());
    }

    @Test
    void esPalindromo_fraseConEspacios() {
        assertTrue(new Palindromo("Able was I ere I saw Elba").calcularPalindromo());
    }

    @Test
    void noEsPalindromo_hello() {
        assertFalse(new Palindromo("hello").calcularPalindromo());
    }

    @Test
    void noEsPalindromo_world() {
        assertFalse(new Palindromo("world").calcularPalindromo());
    }

    @Test
    void noEsPalindromo_notpalindrome() {
        assertFalse(new Palindromo("notpalindrome").calcularPalindromo());
    }
}