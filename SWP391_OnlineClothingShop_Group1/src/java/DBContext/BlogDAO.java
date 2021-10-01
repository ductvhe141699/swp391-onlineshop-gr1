/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ottelia
 */
public class BlogDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ArrayList<Blog> getAllBlogs() {

        try {
            ArrayList<Blog> blogList = new ArrayList<>();
            String query = "select * from Blog";
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                blogList.add(new Blog(rs.getInt("ID"), rs.getString("Author"), rs.getString("Title"), rs.getString("Content"), rs.getString("imageLink")));
            }
        } catch (Exception e) {
        }

        return null;
    }
}
