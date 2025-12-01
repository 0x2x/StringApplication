package org.pluralsight.week10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NorthwindProducts {
    static void main() {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "root");

            // step two
            Statement statement = connection.createStatement();
            // step 3;
            String query = "SELECT * FROM northwind.products;";
            ResultSet resultSet = statement.executeQuery(query);
            //
            while(resultSet.next()) {
                System.out.println(resultSet.getString("ProductName"));
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
