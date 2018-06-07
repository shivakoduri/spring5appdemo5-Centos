package com.myprojects.spring5.examples.applicationdemo.services;

import com.myprojects.spring5.examples.applicationdemo.domain.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
