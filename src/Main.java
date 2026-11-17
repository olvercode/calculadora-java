import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculadora v1.0.0");
            System.out.print("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                0. Salir
                """);

            System.out.print("Seleccione una opción> ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4 ) {
                System.out.print("Primer número> ");
                double a = entrada.nextDouble();

                System.out.print("Segundo número> ");
                double b = entrada.nextDouble();

                switch (opcion){
                    case 1 -> System.out.println("Resultado> " + (a + b));
                    case 2 -> System.out.println("Resultado> " + (a - b));
                    case 3 -> System.out.println("Resultado> " + (a * b));
                    case 4 -> System.out.println("Resultado> " + (a / b));
                }
            } else if (opcion != 0) {
                System.out.println("Message> Opción no válida.");
            }
        }while (opcion != 0);

        entrada.close();
    }
}