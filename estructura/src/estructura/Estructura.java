
package estructura;

import java.util.Scanner;

public class Estructura {

   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println(" 1.para reirse"+" 2.para hablar"+" 3.para depedirese");
        int opcion = sc.nextInt();
        
            switch(opcion){
                
                case 1: 
                    System.out.println("JAJAJAJAJAJAJAJAJ");
                    break;
                    
                    case 2 : System.out.println("hola como estas?");
                    break;
                
                    case 3 : System.out.println("byeee");
                    break;
                
            }
       
    }
}
