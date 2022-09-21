package com.company;
import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DatabaseConnection con = new DatabaseConnection();
        List<Author> authorList = Queries.getAuthors(con.getConnection());

        for(Author aut : authorList){
            System.out.println(aut.getFirstName());
        }
        con.closeConnection();
    } // function ends

}
