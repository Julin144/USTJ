/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;
import java.sql.Connection;  
/**
 *
 * @author 822158274
 */
public class JDBCUsuario {
    Connection conexao;

    public JDBCUsuario(Connection conexao) {
        this.conexao = conexao;
    }

    public JDBCUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
