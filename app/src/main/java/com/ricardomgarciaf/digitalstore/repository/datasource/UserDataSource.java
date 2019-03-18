package com.ricardomgarciaf.digitalstore.repository.datasource;

import com.ricardomgarciaf.digitalstore.repository.dao.UserDao;
import com.ricardomgarciaf.digitalstore.repository.entity.User;

import java.util.List;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;

public class UserDataSource implements DataSource<User> {

    private UserDao userDao;

    @Inject
    public UserDataSource(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public LiveData<List<User>> getAll() {
        return userDao.getAll();
    }

    @Override
    public void insert(User item) {
        userDao.insert(item);
    }

    @Override
    public void delete(User item) {
        userDao.delete(item);
    }

    public boolean findByEmail(String email){
        return userDao.findByEmail(email);
    }

    public boolean findByEmailAndPassword(String email, String password){
        return userDao.findByEmailAndPassword(email,password);
    }
}
