package clasealgoritmos;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int dato,tam,sumaElementos=0,cotadorPares=0,sumaPares=0,ultimaPosision=0;
        System.out.println("Digite el tamaño del arreglo: ");
        
        Scanner numero=new Scanner(System.in);
        tam=numero.nextInt();
        int vec[]= new int [tam];
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite el dato en posicion:"+i);
            dato=numero.nextInt();
            vec[i]=dato;
        }
        System.out.println("El dato en la posicion 0 es: "+vec[0]);
        ultimaPosision=tam-1;
        System.out.println("El dato en la ultima posicion es: "+vec[(tam)-1]);
    }
    
}
