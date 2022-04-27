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
class Figura3D extends Figura{
    
    private int altura; 
    private int base;
    private int profundidade;

    public Figura3D(String nome,int altura,int base, int Profundidade) {
        super(nome);
        this.profundidade = profundidade;
        this.base = base;
        this.altura = altura; 
    }


}
