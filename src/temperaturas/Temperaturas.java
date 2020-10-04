package temperaturas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        float grados = 0;
        float fahrenheit;
        float kelvin;
        boolean control = true;
        Scanner teclado = new Scanner(System.in); //creo el objeto 
        System.out.println("Introduce la temperatura en grados");// imprimo
        while (control) { ///un bucle que hace que se repita si no es correcto el dato
            try {
                grados = teclado.nextFloat(); //pido por teclado el valor 
                control = false; //cambio valor para salir del bucle porque es correcto
                if (grados < -273.15) { //si es menor que -273.15 entra en el if 
                    System.out.println("La temperatuar introducida es fisicamente imposible de alcanzar, introduce la temperatura correcta"); //imprimo
                    control = true; //pongo control en true para que vuelva  entrar en el ciclo

                }
            } catch (InputMismatchException e) {
                System.out.println("introduce la temperatura a través de un valor numérico "); //si es incorrecto salta el error y lo capturo  
                teclado.next(); //borra la entrada incorrecta
                control = true;//pongo control en true para que vuelva  entrar en el ciclo
            }
        }

        fahrenheit = (grados * 9 / 5) + 32;//funcion para calcular el valor
        kelvin = grados + 273.15f;//funcion para calcular el valor

        System.out.println("la temperatura en fahrenheit es: " + fahrenheit);
        System.out.println("la temperatura en kelvin es: " + kelvin);

    }

}
