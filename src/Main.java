import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("Calculadora v1.0.0");
            System.out.print("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                0. Salir
                """);

            try {
                System.out.print("Seleccione una opción> ");
                opcion = entrada.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Primer número> ");
                    double a = entrada.nextDouble();

                    System.out.print("Segundo número> ");
                    double b = entrada.nextDouble();

                    switch (opcion) {
                        case 1 -> System.out.println("Resultado> " + (a + b));
                        case 2 -> System.out.println("Resultado> " + (a - b));
                        case 3 -> System.out.println("Resultado> " + (a * b));
                        case 4 -> {
                            if (b == 0) {
                                throw new ArithmeticException("No se puede dividir entre cero.");
                            }
                            System.out.println("Resultado> " + (a / b));
                        }
                    }
                } else if (opcion != 0) {
                    System.out.println("Message> Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Message> Entrada inválida. Escribe solo números");
                entrada.nextLine();
                opcion = -1;
            } catch (ArithmeticException e) {
                System.out.println("Message> " + e.getMessage());
            }
        }while (opcion != 0);

        entrada.close();
    }
}