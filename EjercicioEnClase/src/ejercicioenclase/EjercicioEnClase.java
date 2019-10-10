//Autor: Eleana Marsela Perez Parra
package ejercicioenclase;

import java.util.Scanner;
public class EjercicioEnClase{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String usuario = "marsela";
        String usuarioingresado = "";
        String clave= "12345";
        String claveingresada = "";
        
        
        System.out.println("Ingrese Usuario");
        usuarioingresado= input.nextLine();
        
        if (usuarioingresado.equals(usuario)){
        
        System.out.println("Ingrese Contraseña");
        claveingresada = input.nextLine();
        }
        else {
        System.out.println("ERROR...Estos datos son incorrectos");
        }
        
        if (claveingresada .equals(clave)){
        System.out.println("¡¡¡BIENVENIDO!!!: "  + usuario);
        }
        else{
        System.out.println("ERROR...Estos datos son incorrectos");
        }
        
    }
    
}
