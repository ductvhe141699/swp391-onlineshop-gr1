
import DBContext.OrderDAO;
import DBContext.UserDAO;
import SMTP.GmailAPI;
import entity.Order;
import entity.Users;
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

    public static void main(String[] args) throws MessagingException {
          OrderDAO orderDAO = new OrderDAO();

            List<Order> orders = orderDAO.getOrderByUserID(5);
        for (Order o : orders ) {
            System.out.println(o);
        }

    }

}
