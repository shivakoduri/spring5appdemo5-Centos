package com.myprojects.spring5.examples.applicationdemo.services;

import com.myprojects.spring5.examples.applicationdemo.commands.ProductForm;
import com.myprojects.spring5.examples.applicationdemo.converters.ProductFormToProduct;
import com.myprojects.spring5.examples.applicationdemo.domain.Product;
import com.myprojects.spring5.examples.applicationdemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    private ProductFormToProduct productFormToProduct;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, ProductFormToProduct productFormToProduct) {
        this.productRepository = productRepository;
        this.productFormToProduct = productFormToProduct;
    }

    @Override
    public List<Product> listAll() {
       List<Product> products = new ArrayList<>();
       productRepository.findAll().forEach(products::add);
       return products;
    }

    @Override
    public Product getById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveOrUpdateProductForm(ProductForm productForm) {
        Product savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

        System.out.println("Saved Product Id:" + savedProduct.getId());
        return  savedProduct;
    }
}
