package org.example;
//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
//Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
//informando de la estación en la que está. También habrá que poner un default
//para cuando el valor de la variable no sea una estación.

public class EstructuraSwitch {
    public static void main(String[] args){

        String estacion = "invierno";

        switch (estacion){
            case "verano":
                System.out.println("La estación es Verano");
                break;
            case "otoño":
                System.out.println("La estación es Otoño");
                break;
            case "invierno":
                System.out.println("La estación es Invierno");
                break;
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            default:
                System.out.println("No es ninguna estación");
        }
    }
}
