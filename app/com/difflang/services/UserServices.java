package com.difflang.services;

import com.difflang.models.User;

import java.util.ArrayList;


public interface UserServices {
    public ArrayList<User> getUser();
    public  boolean addUser(User user);
    public  boolean deleteUser(int id);
    public  boolean updateUser(User user);
}
