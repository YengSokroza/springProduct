package com.example.Spring_Exam.Service.ServiceImpl;

import com.example.Spring_Exam.Model.Product;
import com.example.Spring_Exam.Repository.ProductRepo;
import com.example.Spring_Exam.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepo productRepo;

    @Override
    public Product createProduct(Product product){
        return productRepo.save(product);
    }

    @Override
    public Product findProduct(long id){
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> listProduct(){
        return productRepo.findAll();
    }

    @Override
    public Product updateProduct(long id, Product product){
        Product update = productRepo.findById(id).orElse(null);
        assert update != null;
        update.setName(product.getName());
        update.setPrice_per_unit(product.getPrice_per_unit());
        update.setActive_for_sell(product.isActive_for_sell());
        return productRepo.save(update);
    }

}
