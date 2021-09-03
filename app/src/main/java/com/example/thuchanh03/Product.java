package com.example.thuchanh03;

public class Product {
    String name;
    String numberPhone;
    String email;
    boolean avataUser;

    public Product(String name, String numberPhone, String email, boolean avataUser) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.email = email;
        this.avataUser = avataUser;
    }

    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAvataUser() {
        return avataUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvataUser(boolean avataUser) {
        this.avataUser = avataUser;
    }
}
