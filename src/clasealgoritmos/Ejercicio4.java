package clasealgoritmos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int dato=0, tam=0,datoABuscar=0,datoVector=0,posicion=0;
        boolean numeroEncontrado=false;
        System.out.println("Digite el tamaño del arreglo: ");
        Scanner numero=new Scanner(System.in);
        tam=numero.nextInt();
        int vec[]= new int [tam];
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite el dato en posicion:"+i);
            dato=numero.nextInt();
            vec[i]=dato;
            
        }
        
        System.out.println("Digite el dato que dato que desea buscar: ");
        datoABuscar=numero.nextInt();
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]==datoABuscar) {
                vec[i]=datoVector;
                posicion=i;
                numeroEncontrado=true;

            }else{
                String noEncontrado = "Dato no encontrado";
            }
            
        }
        if (numeroEncontrado==true) {
            System.out.println("El Fue encontrado, y esta en la posicion: " + posicion);
        
        } else {
            System.out.println("El numero no fue encontrado.");
        }
  
    }
    
}
