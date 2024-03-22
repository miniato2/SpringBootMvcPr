package com.ohgiraffers.chap01.dto;

import java.util.Date;

public class OrderDTO {
    private String productName;
    private int quantity;
    private String memberName;
    private String address;
    private String phone;
    private Date orderDt;

    public OrderDTO() {
    }

    public OrderDTO(String productName, int quantity, String memberName, String address, String phone, Date orderDt) {
        this.productName = productName;
        this.quantity = quantity;
        this.memberName = memberName;
        this.address = address;
        this.phone = phone;
        this.orderDt = orderDt;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getOrderDt() {
        return orderDt;
    }

    public void setOrderDt(Date orderDt) {
        this.orderDt = orderDt;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", memberName='" + memberName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", orderDt=" + orderDt +
                '}';
    }
}
