//Auntor: Eleana Marsela Perez Parra
package operadores;
import java.util.Scanner;

public class PrecedenciaOperadores {

    public static void main(String[] args) {
        System.out.println("===Operaciones===");
         //sumar la nota de 3 eestudiantes y obtener el promedio de estas. 
        //Hacerlo en una linea teniendo en cuenta la precedencia de operadores
        // y el uso de parentesis... al final mostrar el resultado  del promedio.
 
        int NotaEstudiante1 = 0;
        int NotaEstudiante2 = 0;
        int NotaEstudiante3 = 0;
        
        
        int SumaNotas= NotaEstudiante1 + NotaEstudiante1 + NotaEstudiante1;
        int Promedio = SumaNotas/3;
        
          System.out.println ("ingrese nota 1: " );
           NotaEstudiante1 = input.nextInt();
           
          System.out.println ("ingrese nota 2: " );
          NotaEstudiante2 = input.nextInt();
          
          System.out.println ("ingrese nota 3: ");
          NotaEstudiante3 = input.nextInt();
          
        System.out.println ("El resultado de la suma es: " +SumaNotas);
        System.out.println ("El promedio de la nota es : " + Promedio);
        
     
       //una intitucion educativa cueta con 3 sedes y cada una cuenta con un numero de estudiantes
       //teniendo en cuenta el total de estudiantes se entregara 3 boletas a cada uno 
        
        
        
        
        
    }
    
}
