
import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int contadorHombres1=0,contadorHombres2=0,contadorHombres3=0,
                contadorMujeres1=0,contadorMujeres2=0,contadorMujeres3=0, edad=0,
                edadMayor = 0,edadMenor=100,promedioEdad=0,SumaEdad=0,contadorParticipantes=0,
                compañia1=0,compañia2=0,compañia3=0,edadCompañia1=0,edadCompañia2=0,
                edadCompañia3=0;
        String nombre="",nombreEdadMayor="",nombreEdadMenor="";
        System.out.println("¿Desea iniciar en la encuesta? 1/si 2/no");
        int participar = input.nextInt();
        
        while (participar==1) {
            System.out.println("¿Desea participar en la encuesta? 1/SI 2/NO");
            int continuar=input.nextInt();
            if (continuar==2) {
                break;
            }
            contadorParticipantes++;
            System.out.println("Digite si es hombre o mujer. 1/Hombre 2/Mujer");
            int genero = input.nextInt();
            System.out.println("Digite su nombre: ");
            nombre=input.next();
            if (genero==1) {
                System.out.println("Digite su compañia, 1, 2 o 3?");
                int compañiaHombres=input.nextInt();
                switch (compañiaHombres) {
                    case 1:
                        contadorHombres1++;
                        compañia1++;
                        System.out.println("Digite edad: ");
                        edad=input.nextInt();
                        edadCompañia1+=edad;
                        break;
                    case 2:
                        contadorHombres2++;
                        compañia2++;
                        System.out.println("Digite edad: ");
                        edad=input.nextInt();
                        edadCompañia2+=edad;
                        break;
                    case 3:
                        contadorHombres3++;
                        compañia3++;
                        System.out.println("Digite edad: ");
                        edad=input.nextInt();
                        edadCompañia3+=edad;
                        break;
                }
                
            } else{
                System.out.println("Digite su compañia, 1, 2 o 3?");
                int compañiaMujeres=input.nextInt();
                switch (compañiaMujeres) {
                    case 1:
                        contadorMujeres1++;
                        compañia1++;
                        System.out.println("Digite edad: ");
                        edad=input.nextInt();
                        edadCompañia1+=edad;
                        break;
                    case 2:
                        contadorMujeres2++;
                        compañia2++;
                        System.out.println("Digite edad: ");
                        edad=input.nextInt();
                        edadCompañia2+=edad;
                        break;
                    case 3:
                        contadorMujeres3++;
                        compañia3++;
                        System.out.println("Digite edad: ");
                        edad=input.nextInt();
                        edadCompañia3+=edad;
                        break;
                }
            }
            if (edad>edadMayor) {
                nombreEdadMayor=nombre;
                edadMayor=edad;
            }
            if (edad<edadMenor) {
                nombreEdadMenor=nombre;
                edadMenor=edad;
            }
            SumaEdad += edad;
                
            }
    double edadPromedioBatallon = (contadorParticipantes==0)?0:SumaEdad/contadorParticipantes;
    int edadPromedioCompañia1 = (compañia1==0)?0:edadCompañia1/compañia1;
    int edadPromedioCompañia2 = (compañia2==0)?0:edadCompañia2/compañia2;
    int edadPromedioCompañia3 = (compañia3==0)?0:edadCompañia3/compañia3;
    System.out.println("Cantidad de hombres en compañia 1: " +contadorHombres1);
    System.out.println("Cantidad de hombres en compañia 2: " +contadorHombres2);
    System.out.println("Cantidad de hombres en compañia 3: " +contadorHombres3);
    System.out.println("Cantidad de mujeres en compañia 1: " +contadorMujeres1 );
    System.out.println("Cantidad de mujeres en compañia 2: " +contadorMujeres2 );
    System.out.println("Cantidad de mujeres en compañia 3: " +contadorMujeres3 );
    System.out.println("El sodado con mayor edad es: " + nombreEdadMayor + ", Su edad es " + edadMayor);
    System.out.println("El sodado con menor edad es: " + nombreEdadMenor + ", Su edad es " + edadMenor);
    System.out.println("El promedio de edad de la copañia 1 es: " + edadPromedioCompañia1);
    System.out.println("El promedio de edad de la copañia 2 es: " + edadPromedioCompañia2);
    System.out.println("El promedio de edad de la copañia 3 es: " + edadPromedioCompañia3);
    System.out.println("El promedio de edad de todo el batallon es: " + edadPromedioBatallon);
    System.out.println("El total de soldados Compañia 1: " + compañia1 );
    System.out.println("El total de soldados Compañia 2: " + compañia2 );
    System.out.println("El total de soldados Compañia 3: " + compañia3 );
    System.out.println("El total de soldados del batallon es: " + contadorParticipantes);

    }
  
}
