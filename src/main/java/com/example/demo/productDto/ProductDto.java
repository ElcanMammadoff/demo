package com.example.demo.productDto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ProductDto {

    private int id;

    private String Markaname;
    private String Modelname;

    private int year;

}
