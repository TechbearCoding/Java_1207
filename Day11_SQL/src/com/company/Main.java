package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Library2",
                    "root", "danger123");

            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from Authors");

            String firstName;
            String lastName;
            while (resultSet.next()) {
                firstName = resultSet.getString("AuthorName");
                lastName = resultSet.getString("AuthorLastName").trim();
                System.out.println(firstName + " " + lastName);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends

}
