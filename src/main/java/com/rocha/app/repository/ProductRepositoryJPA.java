package com.rocha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rocha.app.entity.Product;

@Service
public interface ProductRepositoryJPA  extends JpaRepository<Product, Long>{

}
