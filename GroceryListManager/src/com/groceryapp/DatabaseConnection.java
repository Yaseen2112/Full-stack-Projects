
package com.groceryapp;

import java.sql.*;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydb", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
