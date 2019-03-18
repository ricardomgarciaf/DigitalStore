package com.ricardomgarciaf.digitalstore.repository.datasource;

import com.ricardomgarciaf.digitalstore.repository.dao.OrderDao;
import com.ricardomgarciaf.digitalstore.repository.entity.Order;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;

public class OrderDataSource implements DataSource<Order> {

    private OrderDao orderDao;

    @Inject
    public OrderDataSource(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public LiveData<List<Order>> getAll() {
        return orderDao.getAll();
    }

    public LiveData<List<Order>> getAllByUserId(String userId){
        return orderDao.getAllByUserId(userId);
    }

    @Override
    public void insert(Order item) {
        orderDao.insert(item);
    }

    @Override
    public void delete(Order item) {
        orderDao.delete(item);
    }
}
