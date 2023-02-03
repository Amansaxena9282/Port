package com.training.Port.service;
import com.training.Port.model.User;

import java.util.List;
public interface UserService {
    public List<User>getall();
    public User addUser(User user);
    public User updateUser(User user);
    public String deleteUser(long id);
}
