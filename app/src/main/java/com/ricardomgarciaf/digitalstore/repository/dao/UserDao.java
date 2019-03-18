package com.ricardomgarciaf.digitalstore.repository.dao;

import com.ricardomgarciaf.digitalstore.repository.entity.User;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("SELECT * FROM user")
    LiveData<List<User>> getAll();

    @Query("SELECT COUNT(*) FROM user where email=:email AND password=:password")
    boolean findByEmailAndPassword(String email, String password);

    @Query("SELECT COUNT(*) FROM user where email=:email")
    boolean findByEmail(String email);

    @Delete
    void delete(User user);
}
