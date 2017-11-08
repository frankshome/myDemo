package com.xuhu.demo.manager.impl;

import com.github.pagehelper.PageInfo;
import com.xuhu.demo.domain.UserInfo;

/**
 * Created by xuhu on 2017/11/8.
 */
public interface UserInfoManager {
    PageInfo<UserInfo> pageQueryUserInfoList();
}
