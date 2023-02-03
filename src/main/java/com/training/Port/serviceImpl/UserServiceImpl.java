package com.training.Port.serviceImpl;

import com.training.Port.model.User;
import com.training.Port.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getall() {
        List<User>getall=new ArrayList<>();
        User u1=new User(1,"ashish",28);
        User u2=new User(2,"amanverma",24);
        User u3=new User(3,"amansaxena",22);
        User u4=new User(4,"neeraj",40);
        getall.add(u1);
        getall.add(u2);
        getall.add(u3);
        getall.add(u4);
        return getall();
    }

    @Override
    public User addUser(User user) {
        return user;
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

    @Override
    public String deleteUser(long id) {
        return "deleteid:"+id;
    }
}
