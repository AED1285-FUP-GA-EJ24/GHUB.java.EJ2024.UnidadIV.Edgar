package sumaArreglo;
//Proposito calcular la suma de los elementos de un arreglo
import java.util.Scanner;
public class SumaArreglo {
    public void sumaArreglo(){
        //declarar objeto scanner
        Scanner teclado = new  Scanner(System.in);
        //declaracion de arreglo
        int []a; //declarando el arreglo a
        a = new int[5]; //creando el arreglo
        //lectura de los elementos del arreglo
        for(int i=0;i<5;i++){
            System.out.print("Proporciona elemento "+i+":");
            a[i]=teclado.nextInt();

        }
        //suma de los elementos del arreglo
        int acum = 0;
        for(int i=0;i<a.length; i++){
            acum = acum + a[i];
        }
        //muestro la suma por pantalla
        System.out.println("La suma = "+acum);
        


    }

    
}