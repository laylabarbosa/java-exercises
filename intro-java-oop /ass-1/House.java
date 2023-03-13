/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1_200539617;

/**
 *
 * @author layladesouzabarbosa
 */

public class House {
    private double sellingPrice;
    public int constructionYear;
    protected String adress;

    public House() {
    }

    public House(double sellingPrice, int constructionYear, String adress) {
        this.sellingPrice = sellingPrice;
        this.constructionYear = constructionYear;
        this.adress = adress;
    }


    public House(int constructionYear, String adress, double sellingPrice) {
        this.constructionYear = constructionYear;
        this.adress = adress;
        this.sellingPrice = sellingPrice;
    }

    public House(String adress, double sellingPrice, int constructionYear) {
        this.adress = adress;
        this.sellingPrice = sellingPrice;
        this.constructionYear = constructionYear;
    }
    public House(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }


    public House(String adress) {
        this.adress = adress;
    }

    public House(double sellingPrice, String adress) {
        this.sellingPrice = sellingPrice;
        this.adress = adress;
    }
    
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public String getAdress() {
        return adress;
    }
    
    
    
}
