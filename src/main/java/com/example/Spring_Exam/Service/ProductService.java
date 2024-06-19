package com.example.Spring_Exam.Service;

import com.example.Spring_Exam.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService{
    Product createProduct(Product product);
    Product findProduct(long id);
    List<Product> listProduct();
    Product updateProduct(long id, Product product);
}
