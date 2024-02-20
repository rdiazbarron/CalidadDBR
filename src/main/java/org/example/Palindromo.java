package org.example;

public class Palindromo {
    String palabra;

    public Palindromo(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean calcularPalindromo(){
        String mipalabra = getPalabra();
        mipalabra = mipalabra.toLowerCase();
        mipalabra = mipalabra.replace("//s","");
        int longitud = mipalabra.length();
        for (int i = 0 ; i<(longitud/2);i++) {
            if((mipalabra.charAt(i)!=mipalabra.charAt(longitud-1-i)))
            {
                return false;
            }
        }
        return true;
        }


    }




