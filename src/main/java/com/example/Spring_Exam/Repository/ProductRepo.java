package com.example.Spring_Exam.Repository;

import com.example.Spring_Exam.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
