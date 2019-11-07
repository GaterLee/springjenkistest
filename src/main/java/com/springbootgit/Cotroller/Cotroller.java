package com.springbootgit.Cotroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cotroller {


    @RequestMapping("/hello")
    public  String success(){

        return "此时莺飞草长,相爱的人在路上";
    }






}
