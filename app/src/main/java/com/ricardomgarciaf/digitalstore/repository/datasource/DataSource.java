package com.ricardomgarciaf.digitalstore.repository.datasource;

import java.util.List;

import androidx.lifecycle.LiveData;

public interface DataSource<T> {

    LiveData<List<T>> getAll();

    void insert(T item);

    void delete(T item);
}
