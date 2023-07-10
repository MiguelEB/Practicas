package clasealgoritmos;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int sumaFila=0, sumaColumna=0, columnaASumar=0;
        double sumaTotal=0,contadorDatos=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Digite la cantidad de filas: ");
        int numeroFilas= input.nextInt();
        System.out.println("Digite la cantidad de columnas: ");
        int numeroColumnas= input.nextInt();
        
        int matriz [][]= new int [numeroColumnas][numeroFilas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite el dato: ");
                  matriz[i][j]=input.nextInt();              
            }            
        }
        
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila "+ i + " es: " + sumaFila);
            
        }
        
        for (int i = matriz.length-1 ; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaColumna += matriz[j][i];
            }
            System.out.println("Suma de la columna es: " + sumaColumna);
            
        }
        
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaTotal += matriz[i][j];
                contadorDatos++;
            }  
        }
        
        
        double promedio = sumaTotal/contadorDatos;
        System.out.println("El promedio es: "+promedio);
        
        
        
        
    }
    
}
