/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 822158274
 */

import models.Usuario;

public class Conexao {
    
    
    private Connection conexao;
    Usuario user = new Usuario();
    
    
    public Connection abrirConexao(){
        String url = "jdbc:mysql:localhost:3306/sadb";
        String user = "Alunos";
        String password = "alunos";
        try {
            conexao = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
    
    public int fazerLogin(Usuario usuario)throws Exception{
    
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        try (Connection conn = abrirConexao();
     PreparedStatement ps = conn.prepareStatement(sql)){
     ps.setString(1, usuario.getLogin());
     ps.setString(2, usuario.getSenha());
     try (ResultSet rs = ps.executeQuery()){
        rs.next();
        return rs.getInt(0);
    }
   }
    } 
    
    
    public void fecharConexão(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
