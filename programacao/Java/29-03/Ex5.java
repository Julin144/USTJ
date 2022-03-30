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
public class Ex5 {
    public static void main(String [] args){
        int i =1 ;
        int x = 1;
        
        while(i <= 100){
            System.out.println("pt1 "+ i);
            i++;
        }
        for( int j = 1; j <= 100 ; j++){
            System.out.println("pt2 " + j);
        }
        
        do{
            System.out.println("pt3 " + x);
            x++;
        }
        while(x <= 100);
        
    }
}
