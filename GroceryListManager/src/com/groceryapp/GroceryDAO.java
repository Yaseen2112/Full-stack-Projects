
package com.groceryapp;

import java.sql.*;
import java.util.*;

public class GroceryDAO {
    public List<GroceryItem> getAllItems() {
        List<GroceryItem> list = new ArrayList<>();
        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items")) {
            while (rs.next()) {
                list.add(new GroceryItem(rs.getInt("id"), rs.getString("name"), rs.getInt("quantity")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addItem(String name, int quantity) {
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO items (name, quantity) VALUES (?, ?)")) {
            ps.setString(1, name);
            ps.setInt(2, quantity);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
