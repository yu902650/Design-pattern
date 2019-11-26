package com.atguigu.test1126.test1126.service.impl;

import com.atguigu.test1126.test1126.bean.UserInfo;
import com.atguigu.test1126.test1126.mapper.UserInfoMapper;
import com.atguigu.test1126.test1126.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author bo bo
 * @date 2019/11/26 10:08
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    //标识当前userinfomapper 在容器中！
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updUser(UserInfo userInfo) {
        // update tname set colnmu=? where id=?
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updUserByName(UserInfo userInfo) {
        //根据name 修改 login name
        //第一个参数userinfo 标识修改的数据
        //第二个参数标识根据什么条件修改
        Example example = new Example(UserInfo.class);
        //创建修改条件
        //第一个参数：property 实体类的类名，还是数据库表中的字段名
        //第二个参数：修改的具体值
        example.createCriteria().andEqualTo("name",userInfo.getName());
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        //删除数据
        userInfoMapper.deleteByPrimaryKey(userInfo);
    }

    @Override
    public void delByName(UserInfo userInfo) {
        //example主要
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());
        userInfoMapper.deleteByExample(example);
    }
}
