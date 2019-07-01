package com.atguigu.gmallteset2.service.impl;

import com.atguigu.gmallteset2.bean.UserInfo;
import com.atguigu.gmallteset2.mapper.UserInfoMapper;
import com.atguigu.gmallteset2.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAllUser() {


        return userInfoMapper.selectAll();
    }


    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void upById(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void upByNN(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("nickName",userInfo.getNickName());

        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void deById(String id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deByNN(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("nickName",userInfo.getNickName());
        userInfoMapper.deleteByExample(example);
    }

    @Override
    public UserInfo getInfoById(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }


}
