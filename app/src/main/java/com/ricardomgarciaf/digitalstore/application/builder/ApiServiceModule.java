package com.ricardomgarciaf.digitalstore.application.builder;

import com.ricardomgarciaf.digitalstore.api.DigitalStoreApiInterface;

import dagger.Module;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiServiceModule {

    public DigitalStoreApiInterface digitalStoreApi(OkHttpClient okHttpClient){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(okHttpClient)
                .build();
        return retrofit.create(DigitalStoreApiInterface.class);
    }
}
