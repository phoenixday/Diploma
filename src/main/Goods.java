/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;

/**
 *
 * @author Aline
 */
public class Goods {
    private int idGood;
    private String name;
    private int type;
    private int count;
    private int idStore;
    private double mass;
    private double width;
    private double length;
    private double height;
    private int idContainerType;
    private Date expirationDate;
    private String addFeatures;
    
    public Goods(){}
    public Goods(int idGood, String name, int type, int count, int idStore, 
            double mass, double width, double length, double height, 
            int idContainerType, Date expirationDate, String addFeatures){
        this.idGood = idGood;
        this.name = name;
        this.type = type;
        this.count = count;
        this.idStore = idStore;
        this.mass = mass;
        this.width = width;
        this.length = length;
        this.height = height;
        this.idContainerType = idContainerType;
        this.expirationDate = expirationDate;
        this.addFeatures = addFeatures;
    }
    
    public int getIdGood(){ return this.idGood; }
    public String getName(){ return this.name; }
    public int getType(){ return this.type; }
    public int getCount(){ return this.count; }
    public int getIdStore(){ return this.idStore; }
    public double getMass(){ return this.mass; }
    public double getWidth(){ return this.width; }
    public double getLength(){ return this.length; }
    public double getHeight(){ return this.height; }
    public int getIdContainerType(){ return this.idContainerType; }
    public Date getExpirationDate(){ return this.expirationDate; }
    public String getAddFeatures(){ return this.addFeatures; }
    
    public void setIdGood(int idGood){ this.idGood = idGood; }
    public void setName(String name){ this.name = name; }
    public void setType(int type){ this.type = type; }
    public void setCount(int count){ this.count = count; }
    public void setIdStore(int idStore){ this.idStore = idStore; }
    public void setMass(double mass){ this.mass = mass; }
    public void setWidth(double width){ this.width = width; }
    public void setLength(double length){ this.length = length; }
    public void setHeight(double height){ this.height = height; }
    public void setIdContainerType(int idContainerType){ this.idContainerType = idContainerType; }
    public void setExpirationDate(Date expirationDate){ this.expirationDate = expirationDate; }
    public void setaddFeatures(String addFeatures){ this.addFeatures = addFeatures; }
}
