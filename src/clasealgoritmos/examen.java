package clasealgoritmos;

import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        int  dato=0,opcion=0,tamano,datoABuscar=0,datoVector=0,posicion=0;
        boolean numeroEncontrado=false;
        
        
        System.out.println("Digite el tamaño del arreglo: ");
        Scanner numero=new Scanner(System.in);
        tamano=numero.nextInt();
        int vec[]= new int [tamano];
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite el dato en posicion:"+i);
            dato=numero.nextInt();
            vec[i]=dato;
            
        }
        
        
        
        
        System.out.println("1. imprimir el vector");
        System.out.println("2. Ordenar el vector de forma ascendente");
        System.out.println("3. buscar un dato X en el vector (si lo encuentra debe imprimirlo, sino imprime Dato no encontrado)");
        System.out.println("4. Borrar un dato del vector");
        System.out.println("5. salir");
        
        
        
        while (true) {  
            
            System.out.println("SELECCIONE LA OPCION QUE DESEE: ");
            Scanner input=new Scanner(System.in);
            opcion=input.nextInt();
            
        while (opcion>5||opcion<1) {   
            System.out.println("Reuerde que es una opcion entre 1 y 5.");
            System.out.println("SELECCIONE LA OPCION QUE DESEE: ");
            opcion=input.nextInt();
            
                
            }
        switch (opcion) {
            case 1:
                
                for (int i = 0; i < vec.length; i++) {
                    System.out.println("Vector en posicion "+i+":"+vec[i]);
                }
                break;
 
            case 2:
                
                int auxiliar=0;
                for (int j = 0; j < vec.length-1; j++) {
                    for (int i = 0; i < vec.length-1; i++) {
                        
                    if (vec[i]>vec[i+1]) {
                        auxiliar=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=auxiliar;
                        }
                    }

                }
                for (int i = 0; i < vec.length; i++) {
                    System.out.println("Vector en posicion "+i+":"+vec[i]);
                }
                break;
     
            case 3:
                
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
            System.out.println("El dato fue encontrado, y esta en la posicion: " + posicion);
        
        } else {
            System.out.println("El numero no fue encontrado.");
        }
        break;
                
                
                        
                        
            case 4:
                
                System.out.println("Digite el dato que desea borrar: ");
                int dato2=input.nextInt();
                
                for (int i = 0; i < vec.length-1; i++) {
                    if (dato2==vec[i]) {
                        dato2=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=dato2;
                    }
  
                }
                
                for (int i = 0; i < vec.length-1; i++) {
                    System.out.println("Vector en posicion "+i+":"+vec[i]);
                }
        
                
                break;

        }
        
            if (opcion==5) {
                System.out.println("Gracias por su tiempo.");
                break;
                
            }
        
        }

    }
    
}
