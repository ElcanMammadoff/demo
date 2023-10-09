package com.example.demo.product;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    private int id;
    private String Markaname;

    private String Modelname;


    private int year;

    public Product(String markaname, String modelname, int id, int year) {
        Markaname = markaname;
        Modelname = modelname;
        this.id=id;
        this.year = year;
    }
}
