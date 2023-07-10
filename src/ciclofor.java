
import java.util.Scanner;


public class ciclofor {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i==3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }
                    if (j==3) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }
                    if (k==3) {
                        System.out.println("E");
                    } else {
                        System.out.print(k);
                        System.out.println(" ");
                    }
                    
                }
                
            }
            
        }
        
    }
 }       
    
