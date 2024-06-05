package ejercicioExamen;

import java.util.Scanner;

public class EjercicioExamen {

    public void leerDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = entrada.nextInt();

        // Declarar e inicializar el arreglo
        int[] arreglo = new int[tamano];

        // Leer los datos del arreglo
        leerDatos(arreglo);

        // Visualizar los datos del arreglo
        visualizarDatos(arreglo);
    }

    public static void leerDatos(int[] arreglo) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
    }

    public static void visualizarDatos(int[] arreglo) {
        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
        }
    }
}