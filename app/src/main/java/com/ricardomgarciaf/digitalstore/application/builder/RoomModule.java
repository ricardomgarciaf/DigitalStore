package com.ricardomgarciaf.digitalstore.application.builder;

import android.content.Context;
import android.os.Environment;

import com.ricardomgarciaf.digitalstore.repository.dao.OrderDao;
import com.ricardomgarciaf.digitalstore.repository.dao.ProductDao;
import com.ricardomgarciaf.digitalstore.repository.dao.UserDao;
import com.ricardomgarciaf.digitalstore.repository.database.AppDatabase;
import com.ricardomgarciaf.digitalstore.repository.datasource.OrderDataSource;
import com.ricardomgarciaf.digitalstore.repository.datasource.ProductDataSource;
import com.ricardomgarciaf.digitalstore.repository.datasource.UserDataSource;

import java.io.File;

import androidx.room.Room;
import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    private AppDatabase appDatabase;

    public RoomModule(Context context){
        appDatabase= Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class,
                Environment.getExternalStorageDirectory()+ File.separator+"digitalstore-database").build();
    }

    @AppScope
    @Provides
    AppDatabase provideRoomDatabase(){
        return appDatabase;
    }

    @AppScope
    @Provides
    UserDao provideUserDao(AppDatabase appDatabase){
        return appDatabase.userDao();
    }

    @AppScope
    @Provides
    ProductDao provideProductDao(AppDatabase appDatabase){
        return appDatabase.productDao();
    }

    @AppScope
    @Provides
    OrderDao provideOrderDao(AppDatabase appDatabase){
        return appDatabase.orderDao();
    }

    @AppScope
    @Provides
    UserDataSource provideUserDataSource(UserDao userDao){
        return new UserDataSource(userDao);
    }

    @AppScope
    @Provides
    ProductDataSource provideProductDataSource(ProductDao productDao){
        return new ProductDataSource(productDao);
    }

    @AppScope
    @Provides
    OrderDataSource provideOrderDataSource(OrderDao orderDao){
        return new OrderDataSource(orderDao);
    }

}
