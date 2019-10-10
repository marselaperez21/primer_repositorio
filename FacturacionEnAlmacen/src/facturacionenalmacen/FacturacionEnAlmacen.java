//Autor: Eleana Marsela Perez Parra
package facturacionenalmacen;

import java.util.Scanner;

public class FacturacionEnAlmacen {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String Sede="";
        int DiaFacturacion = 0;
        double ValorCompra=0;
        int Edad =0;
        
    System.out.println("ingrese la sede del almacen: ");   
    Sede = input.nextLine();
    
    System.out.println("ingrese dia de facturacion: ");   
    DiaFacturacion= input.nextInt();
    
    System.out.println("ingrese el valor de la compra: ");   
    ValorCompra = input.nextInt();
    
    System.out.println("ingrese su edad: ");   
    Edad = input.nextInt();
    
  if  (Sede!= "Bogota") {
      
    
    System.out.println("Los descuentos no aplican para esta sede: ");
    }
  else{
      if ((DiaFacturacion == 15 || DiaFacturacion == 30) && ValorCompra >= 50000){
      ValorCompra = ValorCompra * 0.90;
      
    System.out.println("Felicitaciones. Haz obtenido un 10% de descuento en tus compras");
       }
}
    }
}

    
    
    
    