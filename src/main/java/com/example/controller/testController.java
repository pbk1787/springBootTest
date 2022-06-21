package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    
    @RequestMapping("/")
    public void main() {
        System.out.println("main > < ");

    }


    @RequestMapping("/test.do")
    public void test() {
        System.out.println(" test @@@@@@@@@@@@@@@@@@@@ ");

    }

}
