package com.exam.examserver.service;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.helper.UserFoundException;


import java.util.Set;


public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);
}

