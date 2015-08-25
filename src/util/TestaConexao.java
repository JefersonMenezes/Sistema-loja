/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

import visao.JFLogin;

/**
 *
 * @author takedownone
 */
public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        testaConexao();
        JFLogin login = new JFLogin();
        login.show();

    }

    private static void testaConexao() throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        connection.close();
    }
}
