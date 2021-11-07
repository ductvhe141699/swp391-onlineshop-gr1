/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Post;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PostDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ArrayList<Post> getAllPost() {
        ArrayList<Post> postList = new ArrayList<>();
        try {

            String query = "select * from Post  ";
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                postList.add(new Post(rs.getInt("ID"), rs.getString("Description"), rs.getInt("UserID"), rs.getString("date"), rs.getInt("CategoryID"), rs.getString("PostImgURL")));
            }
        } catch (SQLException e) {
        }
        DBcontext.close(conn, ps, rs);
        return postList;
    }
   public void deletePost(String postid) {
        String query = 
                "delete from Post where ID = ?";

        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, postid);
            
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
     public Post getPostByID(String postid) {
        String query = "select *from Post where ID  = ?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, postid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new Post(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6)));

            }
        } catch (SQLException e) {
        }
        DBcontext.close(conn, ps, rs);
        return null;
    }
     public void update(String Description , String date, int CategoryID, String PostImgURL, int id) {
       String   query = "update Post set Description= ? , date= ?, CategoryID= ?, PostImgURL = ?  where ID =?";
        try { conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, Description);
            ps.setString(2, date);
            ps.setInt(3, CategoryID);
            ps.setString(4, PostImgURL);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
