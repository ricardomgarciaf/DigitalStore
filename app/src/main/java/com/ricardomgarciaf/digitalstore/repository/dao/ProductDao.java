package com.ricardomgarciaf.digitalstore.repository.dao;

import com.ricardomgarciaf.digitalstore.repository.entity.Product;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

public interface ProductDao {

    @Insert
    void insert(Product product);

    @Query("SELECT * FROM product")
    LiveData<List<Product>> getAll();

    @Query("SELECT * FROM product WHERE id=:productId")
    Product getProductById(String productId);

    @Delete
    void delete(Product product);
}
