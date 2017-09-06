package com.lavor.jenkins.war;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shitian on 2017-09-06.
 */
@RestController
public class MyController {
    @RequestMapping("/say")
    public String say(){
        System.out.println("hello");
        return "hello";
    }
}
