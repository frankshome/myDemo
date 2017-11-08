package com.xuhu.demo.service;

import com.github.pagehelper.PageInfo;
import com.xuhu.demo.domain.UserInfo;

/**
 * Created by xuhu on 2017/11/8.
 */
public interface UserInfoService {

    PageInfo<UserInfo> pageQueryUserInfoList();
}
