package productoArreglo;
//Proposito: leer un arreglo y mostrar el producto de sus elementos por pantalla
//Autor:
//Fecha:
import java.util.Scanner;
public class ProductoArreglo{
    public void productoArreglo(){
        //creo objeto Scanner
        Scanner teclado = new Scanner(System.in);
         //declaracion de arreglo
         int []a; //declarando el arreglo a
         a = new int[5]; //creando el arreglo
         //lectura de los elementos del arreglo
         for(int i=0;i<5;i++){
             System.out.print("Proporciona elemento "+i+":");
             a[i]=teclado.nextInt();
 
         }
         //multiplique de los elementos del arreglo
         int acum = 1;
         for(int i=0;i<a.length; i++){
             acum = acum * a[i];
         }
         //muestro el producto por pantalla
         System.out.println("El producto = "+acum);
         


    }
}