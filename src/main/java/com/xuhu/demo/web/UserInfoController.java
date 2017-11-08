package com.xuhu.demo.web;

import com.github.pagehelper.PageInfo;
import com.xuhu.demo.domain.UserInfo;
import com.xuhu.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhu on 2017/11/8.
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/list")
    public PageInfo<UserInfo> getUserInfoList(){
        return userInfoService.pageQueryUserInfoList();
    }
}
