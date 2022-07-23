/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user (id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobilenumber varchar(200), address varchar(200), password varchar(200), status varchar(200)) " ;
            DbOperations.setDataOrDelete(userTable,"User Table Created Successfully");

            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");

            String productTable = " create table product(id int AUTO_INCREMENT primary key,name varchar(200), category varchar(200), price varchar(200))";
            DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");
            
            String billTable = " create table bill(id int AUTO_INCREMENT primary key,name varchar(200), mobilenumber varchar(200), date DATE,total varchar(200),createby varchar(200) )";
            DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
