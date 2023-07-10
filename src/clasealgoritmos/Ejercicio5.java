package clasealgoritmos;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        int dato=0,contadorNumerosPares=0,posicionVector2=0,contadorImpares=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector");
        int tamaño= input.nextInt();
        int vector[] = new int [tamaño];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite el dato en posicion:"+i);
            dato=input.nextInt();
            vector[i]=dato;
            
        }
        /*sacar elementos pares
        contar elementos pares -
        crear un vector con tamaño igual al de los numeros pares existentes
        */
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2==0) {
                contadorNumerosPares++;
            }
            
        }
        
        int vector2[] = new int [contadorNumerosPares];
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2!=0) {
                contadorImpares++;
            }
            
            if (vector[i]%2==0) {
                vector2[i-contadorImpares]=vector[i];
            }
            
        }
        System.out.println("Vector 1: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }
        
        System.out.println("Vector 2: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(vector2[i]);
            
        }
        
        
        
    }
    
    
}
