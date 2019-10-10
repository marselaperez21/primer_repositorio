//AUTOR ELEANA MARSELA PEREZ PARRA
package proyectometodos;

import java.util.Scanner; 

public class ProyectoMetodos {

    public static void main(String[] args) {
        String nombre="";
        String gato="";
        int cc;
        Scanner input = new Scanner(System.in);
        
        SinRetornoSinParametros objetosaludo = new SinRetornoSinParametros();
        objetosaludo.saludosena();
        SinRetornoConParametros objeto2 = new   SinRetornoConParametros ();
        System.out.println("INGRESE SU NOMBRE: ");
        nombre=input.nextLine();
        objeto2.ingresenombre(nombre);
        
        
        
        conretornosinparametros objeto3=new conretornosinparametros();
        gato = objeto3.mensaje();
        System.out.println(gato);
        
        conretornoconparametros objeto4=new conretornoconparametros();
        
        int cr=0;
        int n1=0;
        int n2=0;
        int tipoope=0;
        
        System.out.println("ingrese el primer numero: ");
        n1= input.nextInt();
        System.out.println("ingrese el segundo numero: ");
        n2= input.nextInt();
        
        
        
        
        System.out.println("LA OPERACION ES " + cr);
        
                
    }
    
}

