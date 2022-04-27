/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author 822158274
 */
public class Figura2D extends Figura{
    
    private int base;
    private int altura;

    public Figura2D(String nome,int altura , int base) {
        super(nome);
        
        this.base = base;
        this.altura = altura;
        
    }    
}
