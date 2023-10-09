package com.example.demo.controller;

import com.example.demo.Service.ProductService;
import com.example.demo.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;
   private List<Product> products=new ArrayList<>();

@Autowired
    public ProductController(ProductService productService){
    this.productService = productService;
    }

    @GetMapping("/getting")
    public List<Product> getProductMethod(){
     return  productService.getAllProducts();
    }



    @PostMapping("/postmapping")

    public void postMethod( @RequestBody  Product product){
     products.add(product);
    }

    @PutMapping("/putMapping/{id}")
    public List<Product> putMethod(@PathVariable int id, Product product){
    return productService.updateProduct(id,product);
    }

    @DeleteMapping("/deleteMapping")
    public  void deleteMethod(Product product){
     products.remove(product);
    }
}
