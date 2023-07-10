
package clasealgoritmos;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        int tam=0,dato, cambio=0,posicion=0;
        System.out.println("Digite el tamaño del arreglo: ");
        Scanner numero=new Scanner(System.in);
        tam=numero.nextInt();
        int vec[]= new int [tam];
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite el dato en posicion:"+i);
            dato=numero.nextInt();
            vec[i]=dato;
            
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Vector en posicion "+i+":"+vec[i]);
        }
        
        int mayor=vec[0];
        
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]>mayor) {
                mayor=vec[i];
                posicion=i;
                
            } 
            
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La posicion es: " + posicion);
   
    }
    
}
