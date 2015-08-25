/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import visao.JFCriaBanco;

/**
 *
 * @author takedownone
 */
public class ConnectionFactory {
    

    public Connection getConnection() {
        System.out.println("Conectando ao banco...");
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/loja", "root", "lock");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco");
            JFCriaBanco cria = new JFCriaBanco();
            cria.show();
            throw new RuntimeException(e);
            
        }
        
    }
}
