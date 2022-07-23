/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Bill {
    private int id;
    private String name;
    private String mobilenumber;
    private String date;
    private String total;
    private String createby;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobilenumber;
    }

    public void setMobileNumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCreateBy() {
        return createby;
    }

    public void setCreateBy(String createby) {
        this.createby = createby;
    }
    

}
