package calculoSalario;
import java.util.Scanner;
public class CalcularSalario2{
    public static void calcular(){
        //creo objeto Scanner;
        Scanner teclado = new Scanner(System.in);
        double salarioActual, nuevoSalario, aumento,aumentoTotal;
        final int CENTINELA = -9;
        int i=1;
        aumentoTotal = 0;
        System.out.println("Ingreso datos de empleado : "+i+"(-9 para terminar):");
        salarioActual = teclado.nextDouble();

        
        while (salarioActual !=CENTINELA) {
           
               if (salarioActual <= 9000) {
                aumento = 0.2; 
            } else if (salarioActual <= 15000) {
                aumento = 0.1; 
            } else if (salarioActual <= 20000) {
                aumento = 0.05; 
            } else {
                aumento = 0; 
            }

            nuevoSalario = salarioActual + (salarioActual * aumento);
            System.out.println("El aumento es: $"+salarioActual*aumento);
            System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
            aumentoTotal += salarioActual*aumento;
            
            System.out.println("Ingreso datos de empleado : "+i+" (-9 para terminar):");
            do {
                System.out.println("Ingrese el salario actual del empleado (debe ser un número positivo): ");
                salarioActual = teclado.nextDouble();
                if (salarioActual == CENTINELA)
                   break;
                if (salarioActual < 0) {
                    System.out.println("El salario no puede ser negativo. Inténtelo de nuevo.");
                }
            } while (salarioActual < 0);

        
            i++;
        }
        System.out.println("El aumento de todos los empleados = $"+aumentoTotal);

    }
}