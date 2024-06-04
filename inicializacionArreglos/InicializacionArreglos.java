package inicializacionArreglos;
/*
 * Proposito: inicializar arreglos
 */
import java.util.Scanner;
public class InicializacionArreglos{
    public void inicializacionArreglos(){
        //forma 1
        int arreglo1[]; //crea el arreglo
        arreglo1 = new int[3]; // crear un arreglo de enteros de tamaño 3
        for(int i=0;i<arreglo1.length;i++){
            System.out.print("elemento "+i+": "+arreglo1[i]+ "  ");
        }
        System.out.println();
        //forma 2
        double []arreglo2 = new double[5]; //creando e inicalizando un arreglo de tamaño 5
        for(int i=0;i<arreglo2.length;i++){
            System.out.print("elemento "+i+": "+arreglo2[i]+ "  ");
        }
        System.out.println();
        arreglo2[0]= 5.5;
        arreglo2[1]=6.3;
        arreglo2[2]=7.1;
        arreglo2[3]=-8.9;
        arreglo2[4]=101.23;
        for(int i=0;i<arreglo2.length;i++){
            System.out.print("elemento "+i+": "+arreglo2[i]+ "  ");
        }
        System.out.println();

        //creo objeto Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa valores");
        for(int j=0;j<arreglo1.length;j++){
            System.out.print("Introduce valor del elemento "+j+"=");
            arreglo1[j]= entrada.nextInt();

        }
        for(int i=0;i<arreglo1.length;i++){
            System.out.print("elemento "+i+": "+arreglo1[i]+ "  ");
        }
        System.out.println();
        //LOS ARREGLOS SE PUEDEN INICIALIZAR CON VALORES CONSTANTES EN UNA SENTENCIA
        //QUE ADEMÁS ES CAPAZ DE DETERMINAR SU TAMAÑO; 

        int numeros[] = {10,20,30,40,50,60}; //crea un arreglo de tamaño 6 
                                             //y lo inicializa con valors concretos
        for(int i=0;i<6;i++){
            System.out.print("numeros["+i+"]: "+numeros[i]+ "  ");
        }
        System.out.println();

        //otro ejemplo
        int []nms ={3,4,5} ; //crea un arrelo de tamaño 3 y lo inicializa
        System.out.println(nms[0]); //vale 3
        System.out.println(nms[1]); //valor 4
        System.out.println(nms[2]); //vale 5
        System.out.println();

        //otro ejemplo
        char c[]={'L','u','i','s'}; //tamaño del arreglo 4
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println(c[3]);
        System.out.println();
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
        //EL METODO DE INICIALIAR ARREGLOS UTILIZANDO CONSTANTES
        final int ENE = 31, FEB = 28, MAR = 31, ABR = 30, MAY = 31,
            JUN = 30, JUL = 31, AGO = 31, SEP = 30, OCT=31,
            NOV = 30, DIC=31;

        int meses[]={ENE,FEB,MAR,ABR,MAY,JUN,
                     JUL,AGO,SEP, OCT,NOV,DIC};
        System.out.println(meses[0]); //

        System.out.println(meses[11]); //

        System.out.println(meses[1]);



       

        










    }
}