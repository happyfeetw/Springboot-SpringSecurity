package com.zjhc.logindemo.dao;

import com.zjhc.logindemo.domain.SysUser;


public interface UserDao {
    public SysUser findByUserName(String username);
}
