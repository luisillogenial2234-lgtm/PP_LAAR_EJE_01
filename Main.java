// https://github.com/luisillogenial2234-lgtm/PP_LAAR_EJE_01

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                ejecutarOperacion(opcion, num1, num2);
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }

    // Función para mostrar el menú de opciones[cite: 1]
    public static void mostrarMenu() {
        System.out.println("=== MENÚ DE OPCIONES ===");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Division");
        System.out.println("4.- Multiplicación");
        System.out.println("5.- Salir");
    }

    // Funciones para las operaciones básicas[cite: 1]
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Función auxiliar para dirigir la opción seleccionada
    public static void ejecutarOperacion(int opcion, double a, double b) {
        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + sumar(a, b));
                break;
            case 2:
                System.out.println("Resultado de la resta: " + restar(a, b));
                break;
            case 3:
                double resDivision = dividir(a, b);
                if (!Double.isNaN(resDivision)) {
                    System.out.println("Resultado de la división: " + resDivision);
                }
                break;
            case 4:
                System.out.println("Resultado de la multiplicación: " + multiplicar(a, b));
                break;
        }
    }
}
