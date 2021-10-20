/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Cart;
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
public class CartDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    public ArrayList<Cart> getCart(int id) {
        ArrayList<Cart> list = new ArrayList<>();
        try {
            query = "SELECT Cart.ProductID,pro.ProductName,Cart.Amount,pro.SellPrice,pro.ProductImgURL FROM dbo.Cart JOIN (select p.ProductID , ProductName , Description , OriginalPrice , SellPrice  , SalePercent , SubCategoryID , SellerID ,Amount , p.StatusID ,BrandID , height  , width ,weight , s.ProductImgURL FROM  Product p join ProductImg s on p.ProductID = s.ProductID ) pro ON pro.ProductID = Cart.ProductID WHERE Cart.UserID = ?";
            conn = DBcontext.open(); 
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Cart(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("Amount"),rs.getInt("SellPrice"),rs.getString("ProductImgURL")));
            }
        } catch (SQLException e) {
            Logger.getLogger(CartDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        finally{
            DBcontext.close(conn, ps, rs);
        }
        return list;
    }
}
