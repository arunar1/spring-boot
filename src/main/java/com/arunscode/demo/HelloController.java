package com.arunscode.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//make controller rest simple create java class

public class HelloController {
 
    @RequestMapping("/hello")
    public String sayHi(){
        return "Welcome";
    }

    
}
