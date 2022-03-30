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
public class Ex3 {
        public static void main(String[] args) {
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("informe um numero"));
        
        int i =1 ;
        
        do{
            double r = 0;
            r = numero * i;
            JOptionPane.showMessageDialog(null,r );
            i++;
        }
        while(i <= 10);
    }
}
