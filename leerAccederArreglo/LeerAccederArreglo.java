package leerAccederArreglo;
/*
 * Autor:
 * Propósito: dar entrada a los elementos y posterior visualizacion de un
 *            arreglo bidimensional
 * Fecha: 31 de mayo 2024
 */
import java.util.Scanner;
public class LeerAccederArreglo{
    //El método declarado como estático pertenece
    //a la clase y no a los objetos de esta.
    public static void leerAccederArreglo(){
       int v[][] = new int[3][5];
       //invoca al metodo leer
       leer(v);
       visualizar(v);

    }
    public static void  leer(int v[][]){
        int i,j;
        //creo objeto Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada de datos de la matriz:");
        for(i=0;i<v.length;i++){
            System.out.println("Fila: "+i);
            for (j=0;j<v[i].length;j++){
                v[i][j]= entrada.nextInt();
            }
        }
    }
    public static void visualizar(int [][]v){
        int i,j;
        System.out.println("\n\t Matriz leída\n");
        for(i=0;i<v.length;i++){
            for(j=0;j<v[i].length;j++){
                System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }
    }

}