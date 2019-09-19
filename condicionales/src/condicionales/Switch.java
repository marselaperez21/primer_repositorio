//Autor: Eleana Marsela Perez Parra
package condicionales;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int NumeroEstudiantes = 0;
        int NotaEstudiante = 0;
        
        System.out.println("====Registro de calificaciones====");
        
        System.out.println("ingrese el numero de estudiantes: ");
        NumeroEstudiantes=input.nextInt();
        
        System.out.println("ingrese la nota de estudiantes: ");
        NotaEstudiante=input.nextInt();
        
        switch(NotaEstudiante) {
            case 10:
            case 9:
                System.out.println("Exelente");
                break;
                
            case 8:
            case 7:
            case 6:
                System.out.println("Bueno");
                break;
                
            case 5:
            case 4:
                System.out.println("Regular");
                break;
                
            case 3:
            case 2:
            case 1:
                System.out.println("Malo");
                break;
                
            default:
                System.out.println("Ingrese una calificacion valida.");
                break;
                
        }        
                
    }
 
}
                


