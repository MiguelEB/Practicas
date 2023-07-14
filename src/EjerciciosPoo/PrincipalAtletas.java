package EjerciciosPoo;

import java.util.Scanner;

public class PrincipalAtletas {
    
    public static int atletaConMenorTiempo (Atleta atletas[]){
        float tiempo;
        int indice=0;
        
        tiempo = atletas[0].getTiempoAtleta();
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i].getTiempoAtleta()<tiempo) {
                tiempo=atletas[i].getTiempoAtleta();
                indice=i;
                
            }
            
        }
        return indice;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,indiceMenorTiempo;
        float tiempo;
        String nombre;
        
        System.out.println("Digite la cantidad de atletas: ");
        int numeroAtletas = input.nextInt();
        
        Atleta atletas[] = new Atleta[numeroAtletas];
        
        for (int i = 0; i < atletas.length; i++) {
            input.nextLine();
            System.out.println("Digite el nombre del atleta: ");
            nombre = input.nextLine();
            System.out.println("Digite el numero: ");
            numero = input.nextInt();
            System.out.println("Digite el tiempo: ");
            tiempo= input.nextFloat();
            
            atletas[i]= new Atleta(nombre, numero, tiempo);
            
        }
        
        indiceMenorTiempo = atletaConMenorTiempo(atletas);
        System.out.println("El atleta con menor tiempo es: ");
        System.out.println(atletas[indiceMenorTiempo].mostrarDatos());
    }
    
}
