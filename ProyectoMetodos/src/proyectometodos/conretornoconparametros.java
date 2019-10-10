package ProyectoMetodos;

public class conretornoconparametros {
    

    int resultado;
    public int operacion(int a, int b, int op){
          
    int r=0;
 
   
        switch(op){
        case 1: 
        r = a+b;
                
       System.out.println("el resultado de la suma es: " + r);
    break;
            
        case 2:
            
            r = a-b;
             System.out.println("el resultado de la resta es: " + r); 
       break;
            
        case 3:
            
            r= a*b;
         System.out.println("el resultado de la multiplicacion es: " + r); 
       break;
            
        case 4:
            r=a/b;
            System.out.println("el resultado de la division es: " + r); 
       break;
            
    
}
        return r;
}
}
    

