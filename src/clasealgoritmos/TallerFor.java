package clasealgoritmos;

import java.util.Scanner;


public class TallerFor {
    public static void main(String[] args) {
        int dato,tam,sumaElementos=0,cotadorPares=0,sumaPares=0;
        System.out.println("Digite el tamaño del arreglo: ");
        
        Scanner numero=new Scanner(System.in);
        tam=numero.nextInt();
        int vec[]= new int [tam];
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite el dato en posicion:"+i);
            dato=numero.nextInt();
            vec[i]=dato;
        }
        
        for (int i = 1; i < vec.length; i++) {
            sumaElementos+=vec[i];
            if (i%2==0) {
                cotadorPares++;
                sumaPares+=vec[i];
                
            }
        }
        System.out.println("La suma de los elementos es: "+ sumaElementos);
        double promedio =(cotadorPares==0)?0:sumaPares/cotadorPares;
        System.out.println("El promedio de los pares es: "+promedio);
        
    }
}
