package org.example;
//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

public class EstructuraDWhile {

    public static void main (String[] args){
        int numerowhile = 3;

        do{
            System.out.println(numerowhile);
            numerowhile++;
        } while (numerowhile < 3);
    }
}
