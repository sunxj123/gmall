package com.atguigu.gmallteset2.service;


import com.atguigu.gmallteset2.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getAllUser();

    

    void addUser(UserInfo userInfo);

    void upById(UserInfo userInfo);

    void upByNN(UserInfo userInfo);

    void deById(String id);

    void deByNN(UserInfo userInfo);


    UserInfo getInfoById(String id);
}
