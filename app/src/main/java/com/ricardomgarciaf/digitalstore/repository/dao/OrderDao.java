package com.ricardomgarciaf.digitalstore.repository.dao;

import com.ricardomgarciaf.digitalstore.repository.entity.Order;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface OrderDao {

    @Insert
    void insert(Order order);

    @Query("SELECT * FROM `order`")
    LiveData<List<Order>> getAll();

    @Query("SELECT * FROM `order` WHERE userId=:userId")
    LiveData<List<Order>> getAllByUserId(String userId);

    @Query("SELECT * FROM `order` WHERE id=:orderId")
    Order getOrderById(String orderId);

    @Delete
    void delete(Order order);
}
