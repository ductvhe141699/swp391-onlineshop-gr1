/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Order;
import entity.Product;
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
 * @author Admin
 */
public class OrderDAO {

    Connection conn = null;
    PreparedStatement ps = null; //...
    ResultSet rs = null; //Get the results returned

    public List<Order> getOrderByUserID(int userId) {
        List<Order> list = new ArrayList<>();
        String query = "SELECT o.ID, os.Name, o.TotalPrice, o.Date\n"
                + "FROM Orders o  INNER JOIN Order_Status os\n"
                + "ON o.Status = os.ID\n"
                + "WHERE o.UserId = ?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Order(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDate(4)));
            }
        } catch (Exception e) {
        }
        DBcontext.close(conn, ps, rs);
        return list;
    }

    public ArrayList<Order> getOdByListProduct(ArrayList<Product> listP) {
        String query = "select o.ID , o.UserID , o.TotalPrice , o.Note , o.Status , o.Date , d.Order_ID , d.ProductID , d.ProductName , d.ProductPrice ,d.ProductPrice , d.Quantity from Orders o\n"
                + "join Order_Detail d on d.Order_ID = o.ID\n"
                + "where ProductID =  ? ";
        ArrayList<Order> order = new ArrayList<>();

        try {
            conn = new DBcontext().open();
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
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getDate(6),
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

    public ArrayList<Order> getAllOrders() {
        String query = "select o.ID , o.UserID , o.TotalPrice , o.Note , o.Status , o.Date , d.Order_ID , d.ProductID , d.ProductName  ,d.ProductPrice , d.Quantity from Orders o\n"
                + "join Order_Detail d on d.Order_ID = o.ID\n";
        ArrayList<Order> list = new ArrayList<>();

        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getDouble(10),
                        rs.getInt(11)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int getTotalOrders() {
        String query = "select count (*)from Orders";
        int total = 0;
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                return total = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int addOrder(Order order) {
        try {
            conn = DBcontext.open();
            ps = conn.prepareStatement("INSERT INTO dbo.Orders (UserID,TotalPrice,Note,Status,Date) VALUES(?,?,?,1,GETDATE())", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getUserId());
            ps.setDouble(2, order.getTotalPrice());
            ps.setNString(3, order.getNote());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return (int) rs.getLong(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBcontext.close(conn, ps, rs);
        }
        return 0;
    } 
        
     public int TotalCusByListProduct(ArrayList<Product> listP) {
        String query = "select UserID ,count(o.UserID) from Orders o\n"
                + "join Order_Detail d on d.Order_ID = o.ID\n"
                + "where ProductID =  ? "
                + "group by UserID";
        ArrayList<Order> order = new ArrayList<>();
        int total = 0;
        List<Integer> temp = new ArrayList<>();

        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            for (Product p : listP) {

                ps = conn.prepareStatement(query);
                ps.setInt(1, p.getProductID());
                rs = ps.executeQuery();
                while (rs.next()) {
                    if (!temp.isEmpty()) {
                        for (Integer i : temp) {
                            if (i == rs.getInt(1)) {
                                total++;
                            }
                        }
                    }else{
                        total++ ;
                    }
                    temp.add(rs.getInt(1));

                }
            }
        } catch (Exception e) {
        }

        return total;
    }
     
     public int TotalOrdByListP(ArrayList<Product> listP) {
        String query = "select o.id from Orders o\n"
                + "join Order_Detail d on d.Order_ID = o.ID\n"
                + "where ProductID =  ? "
                + "group by o.id";
        ArrayList<Order> order = new ArrayList<>();
        int total = 0;
        List<Integer> temp = new ArrayList<>();

        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            for (Product p : listP) {

                ps = conn.prepareStatement(query);
                ps.setInt(1, p.getProductID());
                rs = ps.executeQuery();
                while (rs.next()) {
                    if (!temp.isEmpty()) {
                        for (Integer i : temp) {
                            if (i == rs.getInt(1)) {
                                total++;
                            }
                        }
                    } else {
                        total++;
                    }
                    temp.add(rs.getInt(1));

                }
            }
        } catch (Exception e) {
        }

        return total;
    }

    public boolean CheckOrderExist(int orderID, ArrayList<Order> olist) {
        boolean flag = false;
        for (Order o : olist) {
            if (orderID == o.getOrderID()) {
                flag = true;
            }
        }
        return flag;
    }

    public void OrderAction(int orderID, String action) {
        String query = "";
        switch (action) {
            case "accept":
                query = "update Orders set Status = '2'\n"
                        + "where ID = ? ";
                break;

            case "reject":
                query = "update Orders set Status = '4'\n"
                        + "where ID =  ? ";
                break;
        }
        
        try {
            conn = new DBcontext().open(); 
             ps = conn.prepareStatement(query);
             ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
