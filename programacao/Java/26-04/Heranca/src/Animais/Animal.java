/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animais;

/**
 *
 * @author 822158274
 */
public class Animal {
   
    private String nome ;
    private int nujmeroPatas;

    public Animal(String nome, int nujmeroPatas) {
        this.nome = nome;
        this.nujmeroPatas = nujmeroPatas;
    }
    public Animal(String nome) {
        this.nome = nome;
    }
    public Animal(int nujmeroPatas) {
        this.nujmeroPatas = nujmeroPatas;
    }
}
