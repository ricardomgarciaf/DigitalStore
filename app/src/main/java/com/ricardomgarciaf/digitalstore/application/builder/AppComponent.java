package com.ricardomgarciaf.digitalstore.application.builder;

import android.content.Context;

import com.ricardomgarciaf.digitalstore.repository.datasource.OrderDataSource;
import com.ricardomgarciaf.digitalstore.repository.datasource.ProductDataSource;
import com.ricardomgarciaf.digitalstore.repository.datasource.UserDataSource;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class,ApiServiceModule.class,RoomModule.class,NetworkModule.class})
public interface AppComponent {

    Context provideContext();

    UserDataSource userDataSource();

    ProductDataSource productDataSource();

    OrderDataSource orderDataSource();
}
