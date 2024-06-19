package com.example.Spring_Exam.Controller;

import com.example.Spring_Exam.Model.Product;
import com.example.Spring_Exam.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable long id){
        return productService.findProduct(id);
    }

    @GetMapping
    public List<Product> listProduct(){
        return productService.listProduct();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id,@RequestBody Product product){
        return productService.updateProduct(id, product);
    }
}
