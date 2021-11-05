/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Banner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SAKURA
 */
public class BannerDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    public ArrayList<Banner> getAllBanner() {
        ArrayList<Banner> list = new ArrayList<>();
        try {
            query = "SELECT * FROM dbo.Banner";
            conn = DBcontext.open();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Banner(rs.getInt("ID"),rs.getString("Img")));
            }
        } catch (SQLException e) {
            Logger.getLogger(Banner.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            DBcontext.close(conn, ps, rs);
        }
        return list;
    }
}
