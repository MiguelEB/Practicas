
import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int respuesta=0,respuesta2=0,aceptados=0,seguir=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("¿Es usted mayor de edad?  1/SI - 2/NO");
            int edad=input.nextInt();
            if (edad==2) {
                    System.out.println("Usted no es admitido, siguiente:");}
            if (edad==1) {
                System.out.println("¿Es usted un ingeniero?   1/SI - 2/NO");}
                respuesta=input.nextInt();
                if (respuesta==2) {
                    System.out.println("Usted no es admitido, siguiente:");
                }
                
            }if (respuesta==1) {
                System.out.println("¿Es su experiencia mayor a 3 años?  1/SI - 2/NO");
                respuesta2 = input.nextInt();
                if (respuesta2==2) {
                    System.out.println("Usted no es admitido, siguiente:");
            
        }
                if (respuesta2==1) {
                aceptados++;
                System.out.println("¿Desea seguir registrando? 1/SI - 2/NO");
                seguir=input.nextInt();
                
                
            }
        }
        System.out.println("La cantidad de aceptados es: " + aceptados);
    }
    
}
         
