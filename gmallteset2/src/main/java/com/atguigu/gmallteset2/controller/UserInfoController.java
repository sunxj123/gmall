package com.atguigu.gmallteset2.controller;

import com.atguigu.gmallteset2.bean.UserInfo;
import com.atguigu.gmallteset2.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/alluser")
    public List<UserInfo> getAllUser(){

        return userInfoService.getAllUser();
    }

    @GetMapping("/getInfoById")
    public UserInfo getInfoById(String id){

        return userInfoService.getInfoById(id);
    }

    @RequestMapping("addUser")
    public void addUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setName("宋zzz");
        userInfo.setNickName("zzz");
        userInfoService.addUser(userInfo);
        System.out.println(userInfo.getId());
    }

    @RequestMapping("upById")
    public void upById(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("5");
        userInfo.setNickName("上课");
        userInfoService.upById(userInfo);
    }

    @RequestMapping("upByNN")
    public void upByNN(){
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName("上课");
        userInfo.setName("laji");
        userInfoService.upByNN(userInfo);
    }

    @RequestMapping("deById/{id}")
    public void deById(@PathVariable String id){
        userInfoService.deById(id);
    }

    @RequestMapping("deByNN")
    public void deByNN(){
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName("song");
        userInfoService.deByNN(userInfo);
    }
}
