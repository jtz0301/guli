package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author jz
 * @create 2019-04-05 16:33
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("list")
    public ResponseEntity<List<UserInfo>> userInfoList(){

        List<UserInfo> list=userService.userInfoList();

        return ResponseEntity.ok(list);
    }


}
