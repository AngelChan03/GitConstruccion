import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ejecutarCalculadora();
    }

    public static void ejecutarCalculadora() {
        Scanner scanner = new Scanner(System.in);
        CalculadoraBasica calculadora = new CalculadoraBasica();

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Módulo");
            System.out.println("7. Salir");
            System.out.print("Ingrese el número de la operación: ");

            int opcionMenu = scanner.nextInt();

            if (opcionMenu == 7) {
                System.out.println("Ha salido de la calculadora.");
                break;
            }

            double resultadoTotal = 0.0;

            switch (opcionMenu) {
                case 1:
                    System.out.print("Ingrese el primer valor de la suma: ");
                    double primerValorSuma = scanner.nextDouble();
                    System.out.print("Ingrese el segundo valor de la suma: ");
                    double segundoValorSuma = scanner.nextDouble();
                    resultadoTotal = calculadora.calcularSuma(primerValorSuma, segundoValorSuma);
                    break;
                
                case 2:
                    System.out.print("Ingrese el primer valor de la resta: ");
                    double primerValorResta = scanner.nextDouble();
                    System.out.print("Ingrese el segundo valor de la resta: ");
                    double segundoValorResta = scanner.nextDouble();
                    resultadoTotal = calculadora.calcularResta(primerValorResta, segundoValorResta);
                    break;

                case 3:
                    System.out.print("Ingrese el factor multiplicando: ");
                    double factorMultiplicando = scanner.nextDouble();
                    System.out.print("Ingrese el multiplicador: ");
                    double multiplicador = scanner.nextDouble();
                    resultadoTotal = calculadora.calcularMultiplicacion(factorMultiplicando, multiplicador);
                    break;

                case 4:
                    System.out.print("Ingrese el numerador: ");
                    double numerador = scanner.nextDouble();
                    System.out.print("Ingrese el denominador: ");
                    double denominador = scanner.nextDouble();
                    resultadoTotal = calculadora.calcularDivision(numerador, denominador);
                    break;

                case 5:
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    resultadoTotal = calculadora.calcularPotencia(base, exponente);
                    break;

                case 6:
                    System.out.print("Ingrese el numerador: ");
                    double numerador = scanner.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    double moduloDivisor = scanner.nextDouble();
                    resultadoTotal = calculadora.calcularModulo(numerador, moduloDivisor);
                    break;
                    
                default:
                    System.out.println("La opcion seleccionada no se encuentra, ingrese un valor que se encuentre dentro del menú.");
                    break;
            }

            System.out.println("El resultado es: " + resultadoTotal + "\n");
        }

        scanner.close();
    }
}
