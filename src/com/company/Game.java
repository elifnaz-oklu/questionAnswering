package com.company;


import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Game implements Serializable {

    private int year;
    private String name;
    private double score;
    private String type;
    private int playerNumber;
    private String company;
    private int price;
    private List<String> shops;


    public Game(String name,int year,double score,String type,int playerNumber,String company,int price){

        this.company=company;
        this.name=name;
        this.playerNumber=playerNumber;
        this.price=price;
        this.score=score;
        this.type=type;
        this.year=year;
        this.shops = Collections.emptyList();

    }

    public Game(String name,int year,double score,String type,int playerNumber,String company,int price,List shops){

        this.company=company;
        this.name=name;
        this.playerNumber=playerNumber;
        this.price=price;
        this.score=score;
        this.type=type;
        this.year=year;
        this.shops=shops;
    }


    @Override
    public String toString() {
        return "Oyunun Adı: "+ getName() + "\nÇıkış Tarihi: " + getYear() + "\nOyunun Türü: "+ getType()+ "\nOyuncu Sayısı: " + getPlayerNumber() + "\nPuanı: "+ getScore()+
                "\nOyunu Çıkaran Şirket: " + getCompany() + "\nOyunun Fiyatı: "+ getPrice();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getShops() {
        return shops;
    }

    public void setShops(List<String> shops) {
        this.shops = shops;
    }
}
