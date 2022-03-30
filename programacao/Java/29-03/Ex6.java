/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author 822158274
 */
public class Ex6 {
    public static void main(String [] args){
        int i =100 ;
        int x = 100;

        while(i >= 1){
           System.out.println("pt1 "+ i);
                i--;
        }
        for( int j = 100; j >=1 ; j--){
            System.out.println("pt2 " + j);
        }

        do{
            System.out.println("pt3 " + x);
            x--;
        }
        while(x >= 1);
    }
}
