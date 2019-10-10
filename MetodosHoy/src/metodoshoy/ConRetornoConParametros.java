
package metodoshoy;

import java.util.Scanner;
        
public class ConRetornoConParametros {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    FormatoFechas FechaMes = new FormatoFechas();
    
    int DiaNacimiento = 0;
    int MesNacimiento = 0;
    int AnyoNacimiento = 0;
    String MesEnLetras ="";
    
    System.out.println("ingrese su fecha de nacimiento");
    System.out.println("ingrese el dia: ");   
    DiaNacimiento = input.nextInt();
    System.out.println("ingrese el mes (utilice solo numeros enteros): ");
    MesNacimiento = input.nextInt();
    System.out.println("ingrese el año: ");
    AnyoNacimiento = input.nextInt();
    
    MesEnLetras = FechaMes.DevolverMesTexto(MesNacimiento);
    System.out.println("usted nacio en el dia "+ DiaNacimiento + " del mes " + MesEnLetras + " del año " +  AnyoNacimiento);
    
    }
    
}
