package com.myprojects.spring5.examples.applicationdemo.converters;

import com.myprojects.spring5.examples.applicationdemo.commands.ProductForm;
import com.myprojects.spring5.examples.applicationdemo.domain.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {

    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        productForm.setId(product.getId().toHexString());
        productForm.setDescription(product.getDescription());
        productForm.setPrice(product.getPrice());
        productForm.setImageUrl(product.getImageUrl());

        return productForm;
    }
}
