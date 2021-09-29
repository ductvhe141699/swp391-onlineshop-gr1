/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Duy Manh
 */
public class Users {
    private int UserID;
    private String UserName;
    private String password;
    private String email;
    private int RoleID;
    private int StatusID;

    public Users() {
    }

    public Users(int UserID, String UserName, String password, String email, int RoleID, int StatusID) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.password = password;
        this.email = email;
        this.RoleID = RoleID;
        this.StatusID = StatusID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }

    public int getStatusID() {
        return StatusID;
    }

    public void setStatusID(int StatusID) {
        this.StatusID = StatusID;
    }

    @Override
    public String toString() {
        return "Users{" + "UserID=" + UserID + ", UserName=" + UserName + ", password=" + password + ", email=" + email + ", RoleID=" + RoleID + ", StatusID=" + StatusID + '}';
    }
    
    
}
