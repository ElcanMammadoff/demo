package com.example.demo.Service;


import com.example.demo.domain.Domain;
import com.example.demo.product.Product;
import com.example.demo.productDto.ProductDto;
import com.example.demo.repository.ProductRepository;
import com.example.demo.request.RequestDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {


    @Autowired
    private ModelMapper modelMapper;

    public Product getProductDto(){
        return modelMapper.map(products,Product.class);
    }



        List<Product> products=new ArrayList<>();


     public List<Product> getAllProducts(){
          return products;
     }

     public List<Product> updateProduct(int id,Product product){
         product.setId(id);
         products.add(id,product);
         return products;
     }





}
