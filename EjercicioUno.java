import java.util.Scanner;

public class EjercicioUno{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");

        int edad = scanner.nextInt();

        System.out.println("Su edad es: " + edad);
        scanner.close();
        }
    }