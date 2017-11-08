package com.xuhu.demo.manager;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuhu.demo.domain.UserInfo;
import com.xuhu.demo.domain.UserInfoExample;
import com.xuhu.demo.manager.impl.UserInfoManager;
import com.xuhu.demo.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xuhu on 2017/11/8.
 */
@Repository
public class UserInfoManagerImpl implements UserInfoManager {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public PageInfo<UserInfo> pageQueryUserInfoList(){
        UserInfoExample example = new UserInfoExample();
        example.setOrderByClause(" create_date desc ");
        UserInfoExample.Criteria criteria = example.createCriteria();
        PageHelper.startPage(1, 20);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;
    }
}
