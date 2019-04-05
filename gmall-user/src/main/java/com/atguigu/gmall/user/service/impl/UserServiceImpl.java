package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author jz
 * @create 2019-04-05 16:45
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}
