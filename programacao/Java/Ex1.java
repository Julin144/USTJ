/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import javax.swing.JOptionPane;
/**
 *
 * @author 822158274
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("informe um numero"));
        
        int i =1 ;
        
        while(i <= 10){
            double r = 0;
            r = numero * i;
            JOptionPane.showMessageDialog(null,r );
            i++;
        } 
    }
    
}
