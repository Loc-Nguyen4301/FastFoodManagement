/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UserDao {

    /**
     *
     * @param user
     */
    public static void save(User user) {
        String query;
        query = " insert into user (name,email,mobilenumber,address,password,status) VALUES ('" + user.getName() + "', '" + user.getEmail() + "', '" + user.getMobileNumber() + "', '" + user.getAddress() + "', '" + user.getPassword() + "', '" + user.getStatus() + "') ";
        DbOperations.setDataOrDelete(query, " Register Successfully ! Wait for Admin Accept ");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select *from user where email='" + email + "' and password='" + password + "' ");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static ArrayList<User> getAllRecords() {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from user");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobilenumber"));
                user.setAddress(rs.getString("address"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Status CHANGED Successfully");
    }

    public static void updatePassword(String email, String password) {
        String query = "update user set password='" + password + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Password CHANGED Successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperations.getData("select *from user where email ='" + email + "' and password ='" + oldPassword + "' ");
            if (rs.next()) {
                updatePassword(email, newPassword);
            } else {
                JOptionPane.showMessageDialog(null, "OldPassword is Wrong !!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
