package demoArreglos;
import java.util.Scanner;
public class DemoArreglos{
    public void demoArreglos(){
        //sintaxis para declaracion de arreglos
        /*
        tipo  [] identificador
        o
        tipo identificador []
        */
        //sintaxis creacion de un arreglo
        /*
         * tipo nombreArreglo [] = new tipo[numeroDeElementos]
         * o
         * tipo nombreArreglo [];
         * nombreArreglo = new tipo[numeroDeElementos]
         */
        System.out.println("Demostración de arreglos unidimensionales");
        //declarando un arreglo de tamaño 10;
        // inicializando
        //int c[] = new int[10]; //declara y crea en la misma linea
        int [] c; //declaro el arreglo
        c=new int[10]; //creando el arreglo
        for(int i=0;i<10;i++){
            
            System.out.println("Valor de c["+i+"]= "+c[i]);
        }
        c[0]=2;
        c[1]=4;
        c[2]=6;
        c[3]=8;
        c[4]=10;
        c[5]=12;
        c[6]=14;
        c[7]=16;
        c[8]=18;
        c[9]=20;
        
        for(int i=0;i<10;i++){
            
            System.out.println("Valor de c["+i+"]= "+c[i]);
        }
        //mas Ejemplos de declaración y creación de arreglos
        int a[] = new int[10]; // a es un arreglo de 10 elementos tipo int

        final int N = 20;
        float [] vector; //declaro arreglo
        vector = new float[N]; //creo el arreglo

        //impresion del arreglo vector
        for(int i=0;i<N;i++){
            System.out.println("Valor de vector["+i+"]= "+vector[i]);
        }

        //Lectura de arreglos por teclado
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<N;i++){
            System.out.print("Introduce el valor del elemento vector["+i+"]=");
            vector[i]=entrada.nextFloat();

        }
        //impresion del arreglo leido
        for(int i=0;i<N;i++){
            System.out.println("Valor de vector["+i+"]= "+vector[i]);
        }
        /*
         * SubIndice o indice de un arreglos
         * Se utiliza INDEXACION BASADA EN CERO,
         */

         int []mes = new int[12]; //mes contiens 12 elementos
                                  //el primero mes[0] y el ultimo mes[11]


         float salarios[];         //declara un arreglo de tipo float
         salarios = new float[25]; // crea el arreglo de 25 elementos

         mes[4] = 5; // asigna el valor 5 al elemento 4
         System.out.println(salarios[mes[4]*3]); // accede al elemento salario[15]

         //TAMAÑO DE UN ARREGLO, ATRIBITO length

         double []v = new double[15];
         System.out.println(v.length); //escribe 15, el número de elementos de v

         


       


        


    }
}