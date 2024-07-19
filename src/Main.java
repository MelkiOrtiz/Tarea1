import java.util.Scanner;

public class Main {

    public static void holaMundo() {
        System.out.println("¡Hola, Mundo!");
    }

    public static void sumaDosNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);
    }

    public static void numeroParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public static void factorialNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }

    public static void tablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + num + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("Tabla de multiplicar de " + num + " en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void encontrarMayorYMenor() {
        Scanner scanner = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int num;

        while (true) {
            System.out.print("Introduce un número (negativo para terminar): ");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("El número más grande es: " + mayor);
            System.out.println("El número más pequeño es: " + menor);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Encontrar el número más grande y el más pequeño");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaDosNumeros();
                    break;
                case 3:
                    numeroParImpar();
                    break;
                case 4:
                    factorialNumero();
                    break;
                case 5:
                    tablaMultiplicar();
                    break;
                case 6:
                    encontrarMayorYMenor();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 7);

        scanner.close();
    }
}

