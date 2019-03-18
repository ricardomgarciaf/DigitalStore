package com.ricardomgarciaf.digitalstore.repository.datasource;

import com.ricardomgarciaf.digitalstore.repository.dao.ProductDao;
import com.ricardomgarciaf.digitalstore.repository.entity.Product;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;

public class ProductDataSource implements DataSource<Product> {

    private ProductDao productDao;

    @Inject
    public ProductDataSource(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public LiveData<List<Product>> getAll() {
        return productDao.getAll();
    }

    @Override
    public void insert(Product item) {
        productDao.insert(item);
    }

    @Override
    public void delete(Product item) {
        productDao.delete(item);
    }
}
