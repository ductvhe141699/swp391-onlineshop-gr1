
import DBContext.UserDAO;
import SMTP.GmailAPI;
import entity.Users;
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
        UserDAO d= new UserDAO();
//        int i = d.checkExitsEmail("kcurromj@mayoclinic.com");
//        System.out.println(i);
        int i = 1 ; 
        if(i!=0){
            System.out.println(i);
        }
                
        
        
    }
    
}
