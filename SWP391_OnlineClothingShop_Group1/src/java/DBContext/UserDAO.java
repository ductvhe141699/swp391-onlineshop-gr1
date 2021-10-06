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
import java.util.Random;

/**
 *
 * @author Admin
 */
public class UserDAO {

    Connection conn = null;
    PreparedStatement ps = null; //...
    ResultSet rs = null; //Get the results returned

    public List<Users> getAllUsers() {
        List<Users> list = new ArrayList<>();
        String query = "select * from Users";
        try {
            conn = new DBcontext().open();
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
        String query = "select * from Users where UserID = ? ";
        try {

            conn = new DBcontext().open();
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
            conn = new DBcontext().open();
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

    //MOI NGUOI CHECK LAI CAI NAY 
    public Users getUserByUsername(String userName) {
        String query = "select * from Users where Username = ?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Users(
                        rs.getInt("UserID"),
                        rs.getString("UserName"),
                        rs.getString("Password"),
                        rs.getString("email"),
                        rs.getInt("RoleID"),
                        rs.getInt("StatusID")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updatePassword(String id, String newPassword) {
        Users toChange = getUsersByID(id);
        String query = "UPDATE Users\n"
                + "SET Password = ?\n"
                + "WHERE UserID = ?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, newPassword);
            ps.setString(2, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int checkExitsEmail(String mail) {
     String  query = "select * from Users where email = ?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, mail);
            rs = ps.executeQuery();
            while (rs.next()) {
                return 1;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static int randomNumber(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }

    public String RandomPassword(int numberOfCharactor) {
        String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
        String alphaUpperCase = alpha.toUpperCase(); // A-Z
        String digits = "0123456789"; // 0-9
        String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }
    
    public void updatePasswordByEmail(String pass  , String email ){
       String query = "UPDATE Users SET  Password = ? WHERE email = ?" ;
          try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, pass);
            ps.setString(2, email);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
   
}
