package com.atguigu.test1126.test1126.service;

import com.atguigu.test1126.test1126.bean.UserInfo;

import java.util.List;

/**
 * @author bo bo
 * @date 2019/11/26 10:07
 * @desc  业务逻辑
 */
public interface UserService {

    List<UserInfo> findAll();

    void addUser(UserInfo userInfo);

    //修改
    void updUser(UserInfo userInfo);

    //修改
    void updUserByName(UserInfo userInfo);

    //delete
    void delUser(UserInfo userInfo);

    void delByName(UserInfo userInfo);
}
