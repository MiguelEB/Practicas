package clasealgoritmos;

import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        int suma=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Digite la cantidad de filas: ");
        int numeroFilas= input.nextInt();
        System.out.println("Digite la cantidad de columnas: ");
        int numeroColumnas= input.nextInt();
        
        
        
        while (numeroColumnas!=numeroFilas) {     
            System.out.println("Recuerde que debe ser una matriz cuadrada");
            System.out.println("Digita la cantidad de filas");
            numeroFilas = input.nextInt();
            System.out.println("Digite el numero de columnas");
            numeroColumnas = input.nextInt();
            
        }
        int matriz [][]= new int [numeroColumnas][numeroFilas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite el dato: ");
                matriz[i][j]= input.nextInt();
                
            }
            
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    suma+=matriz[i][j];
                    
                }
                
            }
            
        }
        
        System.out.println("La suma de la diagonal superior es: " + suma);
    }
    
}
