package miPrincipal;
import demoArreglos.DemoArreglos;
import sumaArreglo.SumaArreglo;
import productoArreglo.ProductoArreglo;
import promedio.Promedio;
import promedio.Promedio2;
import inicializacionArreglos.InicializacionArreglos;
import generacionNombres.*;
import arreglosMultidimensionales.ArreglosMultidimensionales;
import leerAccederArreglo.*;
import calculoSalario.*;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("**********************************************");
            System.out.println("        MENU DE OPCIONES UNIDAD IV            ");
            System.out.println("**********************************************");
            System.out.println("* 1) Demo de arreglos unidimensionales        "); 
            System.out.println("* 2) Suma de un arreglo                       "); 
            System.out.println("* 3) Producto de un arreglo                   "); 
            System.out.println("* 4) Promedio de calificaciones               "); 
            System.out.println("* 5) Promedio de calificaciones v2            ");  
            System.out.println("* 6) Inicialización de arreglos               ");
            System.out.println("* 7) Generación aleatorio de nombres          ");
            System.out.println("* 8) Arreglos Multidimensionales              ");
            System.out.println("* 9) Lectura y acceso de arreglo bidemensional");
            System.out.println("*10) Calculo salario para varios trabajadores v1");
            System.out.println("*11) Calculo salario para varios trabajadores v2");
            System.out.println("*12) Calculo salario para varios trabajadores v3");
            System.out.println();
            System.out.println("* 99) Salir"); 
            System.out.println("**************************************");
            System.out.print("Seleccion Opcion:");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                   //creo el objeto
                   DemoArreglos objDemoArreglos = new DemoArreglos();
                   objDemoArreglos.demoArreglos();
                   break;
                case 2:
                  //creo el objeto
                  SumaArreglo objSumaArreglo = new SumaArreglo();
                  objSumaArreglo.sumaArreglo();
                  break;
                case 3:
                  //crea el objeto
                  ProductoArreglo objProductoArreglo = new ProductoArreglo();
                  objProductoArreglo.productoArreglo();
                  break;
                case 4:
                  //crea el objeto
                  Promedio objPromedio = new Promedio();
                  objPromedio.promedio();
                  break;
                case 5:
                  //crea el objeto
                  Promedio2 objPromedio2 = new Promedio2();
                  objPromedio2.promedio();
                  break;
                case 6:
                   //crea el objeto
                   InicializacionArreglos objIarr = new InicializacionArreglos();
                   objIarr.inicializacionArreglos();
                   break;
                case 7:
                   //crear el objeto
                   GeneracionNombres objNom = new GeneracionNombres();
                   objNom.generacionNombres();
                   break;
                case 8:
                   //crear el objeto
                   ArreglosMultidimensionales objArreMulti = new ArreglosMultidimensionales();
                   objArreMulti.arreglosMultidimensionales();
                   break;
                case 9:
                  //accediente a un método estático 
                   LeerAccederArreglo.leerAccederArreglo();
                   break;
                case 10:
                   CalculoSalario.calcular();
                   break;
                case 11:
                   CalcularSalario2.calcular();
                   break;
                case 12:
                   Calcul0Salario3.calcular();
                   break;
                case 99:
                    System.out.println("Hasta luego");
                    break;
                default:
                 System.out.println("Opción inválida");
            }

        }while(opcion != 99);
        entrada.close();
    }
}