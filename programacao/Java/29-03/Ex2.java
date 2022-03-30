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
public class Ex2 {
        public static void main(String[] args){
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("informe um numero"));
            
        for(int i=1;i <= 10 ; i++){
            double r = 0;
            r = numero * i;
            JOptionPane.showMessageDialog(null,r);
            }
        }
}
