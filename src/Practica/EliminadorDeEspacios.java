package Practica;

import javax.swing.JOptionPane;

public class EliminadorDeEspacios {
    public static void main(String[] args) {
        
        String texto= JOptionPane.showInputDialog(null, "Escribe una cadena: ", "Insercion.", JOptionPane.INFORMATION_MESSAGE);
        char caracterActual;
        String textoSinEspacios="";
        
        for (int i = 0; i < texto.length(); i++) {
            
            caracterActual=texto.charAt(i);
            
            if (caracterActual!=' ') {
                
                textoSinEspacios+=caracterActual;
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, textoSinEspacios, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
