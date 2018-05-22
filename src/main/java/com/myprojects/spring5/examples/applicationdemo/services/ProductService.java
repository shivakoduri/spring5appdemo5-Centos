package com.myprojects.spring5.examples.applicationdemo.services;

import com.myprojects.spring5.examples.applicationdemo.commands.ProductForm;
import com.myprojects.spring5.examples.applicationdemo.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
