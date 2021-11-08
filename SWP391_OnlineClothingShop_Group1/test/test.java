
import DBContext.OrderDAO;
import DBContext.ShipDAO;
import entity.Order;
import entity.Ship;
import entity.ShipInfo;
import java.util.ArrayList;

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
        OrderDAO odao = new OrderDAO();
        ShipDAO sdao = new ShipDAO();
        Order o  =odao.getOrderByOrderID(1);
        System.out.println(o.getProductName());
    }

}
