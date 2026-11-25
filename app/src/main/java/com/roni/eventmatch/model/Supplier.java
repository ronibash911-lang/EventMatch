package com.roni.eventmatch.model;

public class Supplier {


    private int supplierId;
    private String name;
    private String serviceType;
    private String phone;
    private String email;
    private String location;
    private double price;
    private String details;




    public Supplier(int supplierId, String name,
                    String serviceType, String phone,
                    String email, String location,
                    double price, String details) {

        this.supplierId = supplierId;
        this.name = name;
        this.serviceType = serviceType;
        this.phone = phone;
        this.email = email;
        this.location = location;
        this.price = price;
        this.details = details;
    }

    public Supplier() {
    }

    public int getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", details='" + details + '\'' +
                '}';
    }
}
