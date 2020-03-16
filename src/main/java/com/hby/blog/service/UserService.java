package com.hby.blog.service;

import com.hby.blog.po.User;

public interface UserService {
    User check(String username, String password);

}
