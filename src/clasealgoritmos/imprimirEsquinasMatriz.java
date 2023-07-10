package clasealgoritmos;

import java.util.Scanner;

public class imprimirEsquinasMatriz {
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
                if (i==0&&j==0) {
                    System.out.print(matriz[i][j]+ " | ");
                    
                }
                if (i== 0 && j == matriz.length-1) {
                    System.out.println(matriz[i][j] + " | ");
                }
                if (j==0 && i == matriz.length-1) {
                    System.out.print(matriz[i][j]+ " | ");
                    
                }
                if (i == matriz.length-1 && j == matriz.length-1) {
                    System.out.println(matriz[i][j]+ " | ");
                }
                
            }
            
        }
    }
}    