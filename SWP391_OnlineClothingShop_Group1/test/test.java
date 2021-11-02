
import DBContext.OrderDAO;
import DBContext.OrderDetailDAO;
import DBContext.UserDAO;
import SMTP.GmailAPI;
import entity.Order;
import entity.OrderDetail;
import entity.Users;
import java.util.ArrayList;
import java.util.List;
import javax.mail.MessagingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BEAN
 */
public class test {
    public static void main(String[] args) {
        OrderDetailDAO odDAO = new OrderDetailDAO();
        List<OrderDetail> od = odDAO.getOdByOrderId(1);
        for (OrderDetail orderDetail : od) {
            System.out.println(orderDetail.getProductName());
        }
    }
}
//    public static void main(String[] args) throws MessagingException {
//<<<<<<< HEAD
//        OrderDAO orderDAO = new OrderDAO();
//        List<Order> orders = orderDAO.getOrderByUserID(5);
//        for (Order order : orders) {
//            System.out.println(order);
//=======
//          OrderDAO orderDAO = new OrderDAO();
//
//            List<Order> orders = orderDAO.getAllOrders();
//        for (Order o : orders ) {
//            System.out.println(o);
//>>>>>>> 5352cea26f81520573aa49703ca9266c6230c2d6
//        }
//    }
//
//}

