package com.digitalinnovationone.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import com.digitalinnovationone.productcatalog.model.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}