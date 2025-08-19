/**
 * Este programa demuestra cómo usar una variable 'char'
 * para almacenar la inicial del nombre de una persona.
 */

import java.util.Scanner;

public  class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        char inicial = nombre.charAt(0);

        System.out.println("La inicial de su nombre es: " + inicial);
        scanner.close();
    }
}
