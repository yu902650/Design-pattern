package com.atguigu.test1126.test1126.bean;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author bo bo
 * @date 2019/11/26 9:53
 * @desc 用户信息
 */
@Data
public class UserInfo {

    //主键
    @Id
    //普通字段列
    @Column
    //获取数据库主键自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String loginName;

    @Column
    private String nickName;

    @Column
    private String passwd;

    @Column
    private String name;

    @Column
    private String phoneNum;

    @Column
    private String email;

    @Column
    private String headImg;

    @Column
    private String useLevel;

}
