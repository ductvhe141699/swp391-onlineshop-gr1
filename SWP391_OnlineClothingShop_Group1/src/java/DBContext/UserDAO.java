/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserDAO {
    Connection conn =null;
    PreparedStatement ps = null; //...
    ResultSet rs = null; //Get the results returned
    
     public List<Users> getAllUsers() {
        List<Users> list = new ArrayList<>();
        String query = "select * from Users";
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     
     public Users getUsersByID(String id) {
        String query = "select * from Users where UserID = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Users(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
     
      public Users getUsersByEmail(String userEmail) {
        String query = "select * from Users where email = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, userEmail);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Users(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
      
      public Account getAccountByUsername(String userName) {
        String query = "select * from Users where Username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getInt(7), rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     
     public boolean updatePassword(String id, String newPassword) {
        Users toChange = getAccountByID(id);
        String query = "UPDATE Users\n"
                + "SET Password = ?\n"
                + "WHERE UserID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, newPassword);
            ps.setString(2, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

