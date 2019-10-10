//Autor: Eleana Marsela Perez Parra

package ejercicio_for;

import java.util.Scanner;

public class Ejercicio_for {

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
     
      int Cantidad=0;
      int Codigo=0;
      int total=0;
          int computador= 1300000;
   
          int televisor= 800000;
   
          int nevera= 1000000;
   
          int lavadora= 150000;
   
          int microondas= 700000;
          
   System.out.println("EJERCICIO FOR");
   
    System.out.println("  ====ELECTRODOMESTICOS====");
      
    System.out.println(" computador..........$1.300.000- codigo(4321) ");
      
    System.out.println(" televisor..........$800.000- codigo(9876) ");
   
    System.out.println(" nevera..........$1.000.000- codigo(9075) ");
   
    System.out.println(" lavadora..........$1.500.000- codigo(3860) ");
    
    System.out.println(" microondas..........$700.000- codigo(5209) ");
    
    
    System.out.println("ingrese el codigo del producto que desea comprar:  ");
    Codigo = input.nextInt();
    
    System.out.println("ingrese la cantidad del producto que desea llevar:  ");
    Cantidad = input.nextInt();
        
            switch(Codigo)
            {
            case 1:
            total= computador * Cantidad;
            break;
            
            case 2:
            total= televisor * Cantidad;
            break;
    
            case 3:
            total= nevera * Cantidad;
            break;
                    
            case 4:
            total= lavadora * Cantidad;
            break;
            case 5:
            total= microondas * Cantidad;
            break;
                
            default:
           System.out.println("ingrese un codigo valido");
            }
           System.out.println("El valor de la compra es:  " + total);
           
    }
}

   
    
    

