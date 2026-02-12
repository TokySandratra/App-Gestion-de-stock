package com.example.application_gestion_stock.data;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private long id;

    private String label ;
    private int quantity;


    public Article(String label, int quantity) {
        this.label = label;
        this.quantity = quantity;
    }

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }



}
