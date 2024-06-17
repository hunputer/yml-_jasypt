package com.example.jasyptyml.controller;

import com.example.jasyptyml.service.MainService;
import com.example.jasyptyml.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/test")
    public void test(){

        List<UserVO> userList = mainService.test();

        System.out.println("123");

    }

}
