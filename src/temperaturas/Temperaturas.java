package temperaturas;

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        float grados;
        float fahrenheit;
        float kelvin;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura en grados");
        grados = teclado.nextFloat();
        fahrenheit = (grados * 9 / 5) + 32;
        kelvin = grados + 273.15f;

        while (grados < -273.15) {
            System.out.println("La temperatuar introducida es fisicamente imposible de alcanzar, introduce la temperatura correcta");
            grados = teclado.nextFloat();
        }
        System.out.println("la temperatura en fahrenheit es: " + fahrenheit);
        System.out.println("la temperatura en kelvin es: " + kelvin);

    }

}
