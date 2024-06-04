package promedio;

import java.util.Scanner;

/*
 * Proposito: Capturar calidiciones de un grupo y calcular su promedio
 *            utilizando un arreglo de calificaciones
 * Autor: Lourdes Armenta
 * Fecha: 23 de mayo de 2024
 */
public class Promedio{
    public void promedio(){
        //definir el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //declarar el arreglo
        float calf[]; //declarando un arreglo de nombre calf y de tipo float
        int n;//almacena el número de calificaciones
        System.out.println("¿cuántas calificaciones capturaras?");
        n = teclado.nextInt();
        calf=new float[n]; //creando el arreglo calf con n elementos
        //capturo las calificaciones
        float acum_calf=0;
        for(int i=0;i<calf.length;i++){ //length regresa el tamaño del arrego
            System.out.print("Proporciona la calificación "+ (i+1) +": ");
            calf[i]= teclado.nextFloat();
            acum_calf = acum_calf+calf[i];
        }
        float prom= acum_calf/calf.length;
        System.out.println("Promedio = "+prom);

    }
    
}