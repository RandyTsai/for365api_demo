package com.luv2code.springboot.thymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class DemoController {

    // create a mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel){

        Number num = 33445;
        theModel.addAttribute("theDateAUTOAUTO", num);
//        theModel.addAttribute("theDateAUTOAUTO", new java.util.Date());

        return "helloworld";
    }


    @GetMapping("/response")
    public String getResponse(@RequestParam(value = "code", required = false) String code, Model md){

        md.addAttribute("theToken", code);
        return "response";
    }


    @GetMapping("/home")
    public String toHome(){
        return "home";
    }

}
