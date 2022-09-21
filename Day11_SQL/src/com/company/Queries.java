package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Queries {

    public static List<Author> getAuthors(Connection connection){
        List<Author> authors = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from Authors");

            int id;
            String firstName;
            String lastName;
            while (resultSet.next()) {
                id = resultSet.getInt("AuthorId");
                firstName = resultSet.getString("AuthorName");
                lastName = resultSet.getString("AuthorLastName");

                authors.add(new Author(id, firstName, lastName));
            }
            resultSet.close();
            statement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return authors;
    }


}
