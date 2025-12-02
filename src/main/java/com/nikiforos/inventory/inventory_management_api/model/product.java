package com.nikiforos.inventory.inventory_management_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Creates an entity class mapped to a database table
@Table(name = "products") //The name of the table in the database
public class product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //Increment the primary key
    private long id; //Primary key

    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name= "price")
    private double price;

    public product() {}

    product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

   public Long getId() {
        return id;
   }

   public String getName() {
        return name;
   }

   public int getQuantity() {
        return quantity;
   }

   public double getPrice() {
        return price;
   }

   public void voidId(Long id) {
        this.id = id;
   }
   public void setId(Long id) {
        this.id = id;
   }

   public void setName(String name) {
        this.name = name;
   }

   public void setQuantity(int quantity) {
        this.quantity = quantity;
   }

   public void setPrice(double price) {
        this.price = price;
   }
   
  





    

}
