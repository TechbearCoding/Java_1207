package com.company;

import java.sql.*;

public class DatabaseConnection {

    private final String userName = "root";
    private final String pass = "danger123";
    private final String db = "jdbc:mysql://localhost:3306/Library2";

    private Connection connection = null;

    public DatabaseConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    db,
                    userName, pass);
        }
        catch(Exception ex){
            System.out.println(ex);
        }

    }

    public Connection getConnection(){
        return connection;
    }

    public void closeConnection(){
        try{
            connection.close();
        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}
