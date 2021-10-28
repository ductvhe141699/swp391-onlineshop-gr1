/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Order;
import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SAKURA
 */
public class OrderDetailDAO {
    Connection conn = null;
    PreparedStatement ps = null; //...
    ResultSet rs = null; //Get the results returned
    public int addOrderDetail(OrderDetail orderdetail){
        try {           
            conn= DBcontext.open();
            ps = conn.prepareStatement("INSERT INTO dbo.Order_Detail (Order_ID,ProductID,ProductName,ProductPrice,Quantity) VALUES(?,?,?,?,?)");
            ps.setInt(1,orderdetail.getOrderID());
            ps.setInt(2,orderdetail.getProductID());
            ps.setNString(3, orderdetail.getProductName());
            ps.setDouble(4,orderdetail.getProductPrice());
            ps.setInt(5, orderdetail.getQuantity());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            DBcontext.close(conn, ps,rs);
        }
        return 0;
    }
    
    public List<OrderDetail> getOrderDetailsByUserID(int userId) {
        List<Order> list = new ArrayList<>();
        String query = "select od.ProductID, od.ProductName, pg.ProductImgURL, od.ProductPrice\n"
                + "from ((Orders o inner join Order_Detail od on o.ID=od.Order_ID) inner join ProductImg pg\n"
                + "on od.ProductID=pg.ProductID)\n"
                + "where o.UserID=?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new OrderDetail(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        DBcontext.close(conn, ps, rs);
        return list;
    }
}
