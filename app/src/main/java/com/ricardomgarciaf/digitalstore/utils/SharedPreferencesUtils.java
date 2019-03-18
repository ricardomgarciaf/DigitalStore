package com.ricardomgarciaf.digitalstore.utils;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class SharedPreferencesUtils {

    private SharedPreferences sharedPreferences;

    @Inject
    public SharedPreferencesUtils(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public void putData(String key, boolean data){
        sharedPreferences.edit().putBoolean(key, data).apply();
    }

    public boolean getData(String key){
        return sharedPreferences.getBoolean(key,false);
    }
}
