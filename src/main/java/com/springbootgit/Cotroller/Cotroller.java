package com.springbootgit.Cotroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cotroller {


    @RequestMapping("/hello")
    public  String success(){

        return "you should be here";
    }






}
