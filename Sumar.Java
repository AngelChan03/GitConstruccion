import java.util.Scanner;

public class Sumar {

    public static int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el valor de numero 2: ");
        int numero2 = scanner.nextInt();

        int resultado = sumar(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + resultado);

        // Cerrar el scanner para evitar pérdida de recursos
        scanner.close();
    }
}
