package com.ricardomgarciaf.digitalstore.application.builder;

import android.content.Context;
import android.content.SharedPreferences;

import com.ricardomgarciaf.digitalstore.utils.SharedPreferencesUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final static String PREF_NAME="PrefName";

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @AppScope
    @Provides
    Context provideContext(){
        return context;
    }

    @AppScope
    @Provides
    SharedPreferences provideSharedPreferencesUtils(){
        return context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
    }




}
