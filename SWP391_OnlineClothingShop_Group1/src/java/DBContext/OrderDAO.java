/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Order;
import entity.OrderDetail;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class OrderDAO {

    Connection conn = null;
    PreparedStatement ps = null; //...
    ResultSet rs = null; //Get the results returned

    public List<Order> getOrderByUserID(int userId) {
        List<Order> list = new ArrayList<>();
        String query = "SELECT o.ID, o.UserID, "
                + "o.TotalPrice, o.Note, os.Name, "
                + "o.DayBuy "
                + "FROM Orders o  INNER JOIN Order_Status os\n"
                + " ON o.Status = os.ID\n"
                + "WHERE o.UserId = ?";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Order(
                        rs.getInt("ID"),
                        rs.getInt("UserId"),
                        rs.getFloat("TotalPrice"),
                        rs.getString("Note"),
                        rs.getString("Name"),
                        rs.getString("Daybuy")
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public ArrayList<Order> getOdByProdID(ArrayList<Product> listP) {
        String query = "select o.ID , o.UserID , o.TotalPrice , o.Note , o.Status , o.Date , d.Order_ID , d.ProductID , d.ProductName , d.ProductPrice ,d.ProductPrice , d.Quantity from Orders o\n"
                + "join Order_Detail d on d.Order_ID = o.ID\n"
                + "where ProductID =  ? ";
        ArrayList<Order> order = new ArrayList<>();

        conn = new DBcontext().open();
        try {
            ps = conn.prepareStatement(query);
            for (Product p : listP) {

                ps = conn.prepareStatement(query);
                ps.setInt(1, p.getProductID());
                rs = ps.executeQuery();
                while (rs.next()) {
                    // o.ID , o.UserID , o.TotalPrice , o.Note , o.Status , o.Date , d.Order_ID , d.ProductID , d.ProductName , d.ProductPrice ,d.ProductPrice , d.Quantity 
                    order.add(new Order(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getDouble(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getInt(8),
                            rs.getString(9),
                            rs.getDouble(10),
                            rs.getInt(11)
                    ));
                }
            }
        } catch (Exception e) {
        }

        return order;
    }

}
