package com.nezamipour.mehdi.digikala.data.database;

import com.nezamipour.mehdi.digikala.data.model.product.Product;

import java.util.List;

public class ProductRepository {

    //singleton

    private static ProductRepository sRepository;
    private List<Product> mAllProducts;
    private List<Product> mOfferedProducts;
    //TODO add more list for save products in repository


    private ProductRepository() {
    }

    public static ProductRepository getInstance() {
        if (sRepository == null) {
            sRepository = new ProductRepository();
        }
        return sRepository;
    }



    public List<Product> getAllProducts() {
        return mAllProducts;
    }

    public void setAllProducts(List<Product> allProducts) {
        mAllProducts = allProducts;
    }

    public List<Product> getOfferedProducts() {
        return mOfferedProducts;
    }

    public void setOfferedProducts(List<Product> offeredProducts) {
        mOfferedProducts = offeredProducts;
    }
}
