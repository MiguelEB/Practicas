package HackerRank;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Digite el tamaño del arreglo");
        Scanner input = new Scanner(System.in);
        int tamañoArreglo = input.nextInt();
        int arreglo[] = new int [tamañoArreglo];
        
        for (int i = 0; i < tamañoArreglo; i++) {
            System.out.println("Digite el valor en la posicion " + i);
            int posicion = input.nextInt();
            arreglo[i]=posicion;
            
        }
        
        
    }
    
}
