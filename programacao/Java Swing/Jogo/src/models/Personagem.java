/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 822158274
 */
public class Personagem {
    private int id_personagem;
    private String ds_login;
    private String ds_senha;
    private String nm_personagem;
    private int nr_energia;
    private int nr_fome;
    private int nr_sono;

    public int getId_personagem() {
        return id_personagem;
    }

    public void setId_personagem(int id_personagem) {
        this.id_personagem = id_personagem;
    }

    public String getDs_login() {
        return ds_login;
    }

    public void setDs_login(String ds_login) {
        this.ds_login = ds_login;
    }

    public String getDs_senha() {
        return ds_senha;
    }

    public void setDs_senha(String ds_senha) {
        this.ds_senha = ds_senha;
    }

    public String getNm_personagem() {
        return nm_personagem;
    }

    public void setNm_personagem(String nm_personagem) {
        this.nm_personagem = nm_personagem;
    }

    public int getNr_energia() {
        return nr_energia;
    }

    public void setNr_energia(int nr_energia) {
        this.nr_energia = nr_energia;
    }

    public int getNr_fome() {
        return nr_fome;
    }

    public void setNr_fome(int nr_fome) {
        this.nr_fome = nr_fome;
    }

    public int getNr_sono() {
        return nr_sono;
    }

    public void setNr_sono(int nr_sono) {
        this.nr_sono = nr_sono;
    }
}
