package Practica;

import javax.swing.JOptionPane;

public class CadenaVacia {
    public static void main(String[] args) {
        
        String texto= JOptionPane.showInputDialog(null, "Inserta una cadena vacía para terminar: ", "Insercion.", JOptionPane.INFORMATION_MESSAGE);
        
        String cadenaResultante="";
        
        while (!texto.isEmpty()) { 
            
            cadenaResultante+=texto;
            texto= JOptionPane.showInputDialog(null, "Inserta una cadena vacía para terminar: ", "Insercion.", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
