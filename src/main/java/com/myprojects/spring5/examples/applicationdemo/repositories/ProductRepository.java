package com.myprojects.spring5.examples.applicationdemo.repositories;

import com.myprojects.spring5.examples.applicationdemo.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
