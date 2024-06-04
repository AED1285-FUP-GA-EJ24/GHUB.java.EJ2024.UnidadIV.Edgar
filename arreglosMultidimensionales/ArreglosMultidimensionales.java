package arreglosMultidimensionales;
/*Proposito: demostra el uso de arrelos de mas de una dimension
*/

public class ArreglosMultidimensionales{
    public void arreglosMultidimensionales(){
        //sintaxis:
        /* forma 1
         * <tipo de datoElemento> <nombre arreglo> [][];
         * forma 2
         * <tipo de datoElemento>  [][]<tipo de datoElemento> ;
         */
        char pantalla[][];
        int puesto[][];
        double[][]matriz; 
        //Las operaciones de arriba unicamente son referncias
        //para crearlas y asignarles memoria se requieres lo siguiente
        /*
         * sintaxis para asignar memorias a una matriz
         * <tipo de datoElemento> <nombre arreglo> [][] = 
         *          new <tipo de datoElemento>[<numero de Filas]>][<Numero de Columnas>]
         * 
         */
        pantalla = new char[80][24]; //matriz con 80 filas y 24 columnas
        puesto = new int[10][5]; //matriz de 10 filas y 5 columnas
        final int N=4;
        matriz = new double[N][N]; //matri cuadrada de N*N elementos
        //inicializar matriz puesto
        puesto[0][0]= 1;
        puesto[0][1]= 2;
        puesto[0][2]= 3;
        puesto[0][3]= 4;
        puesto[0][4]= 5;

        puesto[1][0]= 1;
        puesto[1][1]= 2;
        puesto[1][2]= 3;
        puesto[1][3]= 4;
        puesto[1][4]= 5;

        puesto[2][0]= 1;
        puesto[2][1]= 2;
        puesto[2][2]= 3;
        puesto[2][3]= 4;
        puesto[2][4]= 5;

        puesto[3][0]= 1;
        puesto[3][1]= 2;
        puesto[3][2]= 3;
        puesto[3][3]= 4;
        puesto[3][4]= 5;

        puesto[4][0]= 1;
        puesto[4][1]= 2;
        puesto[4][2]= 3;
        puesto[4][3]= 4;
        puesto[4][4]= 5;

        puesto[5][0]= 1;
        puesto[5][1]= 2;
        puesto[5][2]= 3;
        puesto[5][3]= 4;
        puesto[5][4]= 5;

        puesto[6][0]= 1;
        puesto[6][1]= 2;
        puesto[6][2]= 3;
        puesto[6][3]= 4;
        puesto[6][4]= 5;

        puesto[7][0]= 1;
        puesto[7][1]= 2;
        puesto[7][2]= 3;
        puesto[7][3]= 4;
        puesto[7][4]= 5;

        puesto[8][0]= 1;
        puesto[8][1]= 2;
        puesto[8][2]= 3;
        puesto[8][3]= 4;
        puesto[8][4]= 5;

        puesto[9][0]= 1;
        puesto[9][1]= 2;
        puesto[9][2]= 3;
        puesto[9][3]= 4;
        puesto[9][4]= 5;

        //Recorrer arreglos
        for(int i=0;i<10;i++)
        {
            System.out.println("\nvalores de renglon "+i+": ");
            System.out.print(puesto[i][0]+" "+puesto[i][1]+" "+puesto[i][2]+" "+puesto[i][3]+" "+puesto[i][4]);
        }
        System.out.println();
        for(int i=0;i<80;i++){
            System.out.println("\nvalores de renglon "+i+": ");
            for(int j=0;j<24;j++){
                System.out.print(pantalla[i][j]+"B");
            }
            System.out.println();

        }
        //Recorrer el arrelo matriz
        for(int i=0;i<4;i++){
            System.out.println("\nvalores de renglon "+i+": ");
            System.out.println(matriz[i][0]+" "+matriz[i][1]+" "+matriz[i][2]+" "+matriz[i][3]);

        }
        System.out.println();
        //Recorrer de nuevo la matriz
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("Matriz["+i+"]["+j+"]="+matriz[i][j]+" ");
                
            }
            System.out.println();
        }
        //Asignando nuevos valores a ciertos elementos de la matriz
        matriz[0][0]=2.1;
        matriz[1][1]=4.2;
        matriz[2][2]=6.3;
        matriz[3][3]=8.4;
        System.out.println();
        //Recorrer de nuevo la matriz
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("Matriz["+i+"]["+j+"]="+matriz[i][j]+" ");
                
            }
            System.out.println();
        }


        //inicalizacion de arreglos multidimensiones
        int tabla[][]={{51,52,53},
                       {54,55,56}};

        //el reglon de arriba defina un arreglos de 2renglones y 3 columnas
        //por lo tanto tiene 2X3 elementos, es decir 6 elementos
         //Recorrer de nuevo la matriz
         for(int i =0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("tabla["+i+"]["+j+"]="+tabla[i][j]+" ");
                
            }
            System.out.println();
        }
        //inicalizacion de arreglos multidimensiones
        int tabla2[][]={ {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12}};
        //la matriz tabla2 tiene 3 renglones y 4 columnas
        //Recorrer de nuevo la matriz
        for(int i =0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print("tabla2["+i+"]["+j+"]="+tabla2[i][j]+" ");
                
            }
            System.out.println();
        }
        //FORMA 2 DE RECORRER UNA MATRIZ
        for(int i =0;i<tabla2.length;i++){
            for(int j=0;j<tabla2[i].length;j++){
                System.out.print("tabla2["+i+"]["+j+"]="+tabla2[i][j]+" ");
                
            }
            System.out.println();
        }






    }

}