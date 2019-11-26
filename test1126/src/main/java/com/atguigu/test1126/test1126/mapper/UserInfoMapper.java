package com.atguigu.test1126.test1126.mapper;

import com.atguigu.test1126.test1126.bean.UserInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author bo bo
 * @date 2019/11/26 10:05
 * @desc 数据访问层
 */
//mapper的泛型 标识当前mapper要操作的实体类
@Repository
public interface UserInfoMapper extends Mapper<UserInfo> {

}
