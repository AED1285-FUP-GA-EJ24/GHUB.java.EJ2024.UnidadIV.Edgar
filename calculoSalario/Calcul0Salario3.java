package calculoSalario;
import java.util.Scanner;

public class Calcul0Salario3 {
    public static void calcular() {
        Scanner teclado = new Scanner(System.in);
        final int CENTINELA = -9;
        int cantidadEmpleados = 5; // Puedes cambiar la cantidad de empleados según tus necesidades
        double[] salarios = new double[cantidadEmpleados];
        double aumentoTotal = 0;

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingreso datos del empleado " + (i + 1) + " (-9 para terminar):");
            do {
                System.out.println("Ingrese el salario actual del empleado (debe ser un número positivo): ");
                salarios[i] = teclado.nextDouble();
                if (salarios[i] == CENTINELA)
                    break;
                if (salarios[i] < 0) {
                    System.out.println("El salario no puede ser negativo. Inténtelo de nuevo.");
                }
            } while (salarios[i] < 0);

            if (salarios[i] == CENTINELA)
                break;

            double aumento;
            if (salarios[i] <= 9000) {
                aumento = 0.2;
            } else if (salarios[i] <= 15000) {
                aumento = 0.1;
            } else if (salarios[i] <= 20000) {
                aumento = 0.05;
            } else {
                aumento = 0;
            }



            double nuevoSalario = salarios[i] + (salarios[i] * aumento);
            System.out.println("El aumento es: $" + salarios[i] * aumento);
            System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
            aumentoTotal += salarios[i] * aumento;

        }
        System.out.println("El aumento total de todos los empleados = $" + aumentoTotal);
    }
}