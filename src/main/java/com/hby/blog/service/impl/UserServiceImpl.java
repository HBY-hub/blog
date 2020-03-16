package com.hby.blog.service.impl;

import com.hby.blog.dao.UserRepository;
import com.hby.blog.po.User;
import com.hby.blog.service.UserService;
import com.hby.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User check(String username, String password) {
        User user=userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));

        return user;
    }
}
