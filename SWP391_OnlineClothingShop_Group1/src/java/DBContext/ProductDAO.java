/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Product;
import entity.Blog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BEAN
 */
public class ProductDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            
            query = "select p.ProductID , ProductName , Description , OriginalPrice , \n"
                    + "SellPrice  , SalePercent , SubCategoryID , SellerID , \n"
                    + "Amount , StatusID , StatusID ,BrandID , height  , width ,weight , s.ProductImgURL from  Product p \n"
                    + "join ProductImg s \n"
                    + "on p.ProductID = s.ProductID ";
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("ProductID"), 
                        rs.getString("ProductName"), 
                        rs.getString("Description"),
                        rs.getDouble("OriginalPrice"),
                        rs.getDouble("SellPrice"),
                        rs.getDouble("SalePercent"),
                        rs.getInt("SubCategoryID"),
                        rs.getInt("SellerID"),
                        rs.getInt("Amount"),
                        rs.getInt("StatusID"),
                        rs.getInt("BrandID"),
                        rs.getDouble("height"),
                        rs.getDouble("width"),
                        rs.getDouble("weight"),
                        rs.getString("ProductImgURL")
                ));
            }
        } catch (SQLException e) {
        }

        return list;
    }

    public List<Product> getProductQuery(String query, int subcategory, int brand, int price, int sortType, int sortMode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
