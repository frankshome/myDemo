package com.xuhu.demo.service;

import com.github.pagehelper.PageInfo;
import com.xuhu.demo.domain.UserInfo;
import com.xuhu.demo.manager.impl.UserInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuhu on 2017/11/8.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoManager userInfoManager;

    @Override
    public PageInfo<UserInfo> pageQueryUserInfoList(){
        return userInfoManager.pageQueryUserInfoList();
    }
}
