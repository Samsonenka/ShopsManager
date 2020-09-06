package com.pavelsamsonenka.Shops.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shopID;

    private String shopName;
    private String shopCity;
    private String shopAddress;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "supplier_id")
//    private Set<Supplier> suppliers = new HashSet<>();

    public Shop() {
    }

    public Shop(String shopName, String shopCity, String shopAddress) {
        this.shopName = shopName;
        this.shopCity = shopCity;
        this.shopAddress = shopAddress;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopCity() {
        return shopCity;
    }

    public void setShopCity(String shopCity) {
        this.shopCity = shopCity;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
}
