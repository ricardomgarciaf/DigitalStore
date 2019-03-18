package com.ricardomgarciaf.digitalstore.repository.database;

import com.ricardomgarciaf.digitalstore.repository.converter.Converters;
import com.ricardomgarciaf.digitalstore.repository.dao.OrderDao;
import com.ricardomgarciaf.digitalstore.repository.dao.ProductDao;
import com.ricardomgarciaf.digitalstore.repository.dao.UserDao;
import com.ricardomgarciaf.digitalstore.repository.entity.Order;
import com.ricardomgarciaf.digitalstore.repository.entity.Product;
import com.ricardomgarciaf.digitalstore.repository.entity.User;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {User.class, Product.class, Order.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public abstract ProductDao productDao();

    public abstract OrderDao orderDao();
}
