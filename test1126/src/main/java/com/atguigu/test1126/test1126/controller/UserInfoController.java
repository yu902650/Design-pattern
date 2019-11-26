package com.atguigu.test1126.test1126.controller;

import com.atguigu.test1126.test1126.bean.UserInfo;
import com.atguigu.test1126.test1126.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bo bo
 * @date 2019/11/26 10:12
 * @desc
 */
@Slf4j
@RestController
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("findall")
    public List<UserInfo> getUserService() {
        return userService.findAll();
    }

    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfo.setLoginName("adminStr");
        userInfo.setPasswd("666666");
        userService.addUser(userInfo);
        log.info("新增后的主键 ：" + userInfo.getId());
    }

    @RequestMapping("updById")
    public String updById(UserInfo userInfo){
        userInfo.setName("0218 优秀");
        userInfo.setId("4");
        userService.updUser(userInfo);
        return "upd ok";
    }

    @RequestMapping("updByName")
    public String updByName(UserInfo userInfo){
            userInfo.setName("0218 优秀");
            userInfo.setLoginName("flybird");
            userService.updUserByName(userInfo);
            return "ok";
    }

    /**
     * http://localhost:8080/delUser?id=4
     * springmvc 传值中的一种
     *
     * @param userInfo
     * @return
     */
    @RequestMapping("delUser")
    public String delUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "del ok";
    }

    @RequestMapping("delUserByName")
    public String delUserByName(UserInfo userInfo){
        userService.delByName(userInfo);
        return "del by name ok ";
    }


}
