package com.springbootgit.Cotroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cotroller {


    @RequestMapping("/hello")
    public  String success(){

        return "愿世间美好,与你环环相扣,此时已莺飞草长,相爱的人在路上!!!";
    }






}
