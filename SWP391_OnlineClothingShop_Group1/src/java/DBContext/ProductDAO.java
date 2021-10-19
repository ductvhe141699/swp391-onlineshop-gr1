/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Product;
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

    public List<Product> getProductQuery(String Query, int subcategory, int brand, int price, int sortType, int sortMode) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            int count = 1;
            query = "select p.ProductID , ProductName , Description , OriginalPrice , \n"
                    + "SellPrice  , SalePercent , SubCategoryID , SellerID , \n"
                    + "Amount , StatusID , StatusID ,BrandID , height  , width ,weight , s.ProductImgURL from  Product p \n"
                    + "join ProductImg s \n"
                    + "on p.ProductID = s.ProductID "
                    + "WHERE p.ProductName LIKE ? AND p.StatusID!= 2 ";
            if(subcategory != 0)
            {
                query +=" AND SubCategoryID = ? ";
            }
            if(brand != 0)
            {
                query +=" AND BrandID = ? ";
            }
            switch(price)
            {
                case 0:
                    break;
                case 1:
                    query += " AND p.SellPrice<100000 ";
                    break;
                case 2:
                    query += " AND p.SellPrice>=100000 AND p.SellPrice<500000 ";
                    break;
                case 3:
                    query += " AND p.SellPrice>=500000 AND p.SellPrice<1000000 ";
                    break;
                case 4:
                    query += " AND p.SellPrice>=1000000 AND p.SellPrice<5000000 ";
                    break;
                case 5:
                    query += " AND p.SellPrice>=5000000 ";
                    break;
            }
            switch(sortType)
            {
                case 0:
                    break;
                case 1:
                    query += " ORDER BY p.SellPrice ";
                    break;
                case 2:
                    query += " ORDER BY p.SalePercent ";
                    break;
                case 3:
                    query += " ORDER BY p.ProductName ";
                    break;
            }
            if(sortType!=0)
            {
                if(sortMode==1)
                    query += " ASC ";
                if(sortMode==2)
                    query += " DESC ";
            }
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setNString(count++, "%"+Query+"%");
            if(subcategory!=0)
            {
                ps.setInt(count++, subcategory);
            }
            if(brand!=0)
            {
                ps.setInt(count++,brand);
            }
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
        DBcontext.close(conn, ps, rs);
        return list;
    }
    
    
     public ArrayList<Product> getProductIDBySellerID(int sellerID) {
        String query = "select * from Users u\n"
                + "JOIN Product p  on u.UserID = p.SellerID\n"
                + "where UserID = ? ";
        ArrayList<Product> list = new ArrayList<>();
        try {
            conn = new DBcontext().open() ; 
            ps = conn.prepareStatement(query);
            ps.setInt(1, sellerID);
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
        } catch (Exception e) {
        }
        return list;
    }
     public List<Product> getProductBySellerID(int id){
        List<Product> list = new ArrayList<>();
        String query ="select *from Product \n"
                + " where SellerID = ? ";
        try {
            conn = new DBcontext().open() ; 
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
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
//                        rs.getInt("BrandID"),
//                        rs.getDouble("height"),
//                        rs.getDouble("width"),
//                        rs.getDouble("weight"),
//                        rs.getString("ProductImgURL")));
//            }
//        } catch (Exception e) {
//        }
//        
//        
//        
//    
//        return list;
        
      
    }}
