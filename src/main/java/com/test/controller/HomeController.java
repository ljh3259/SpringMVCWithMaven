package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jihoonlee on 2017. 10. 21..
 */
@Controller
public class HomeController {
    @RequestMapping(value ="/")
    public String home(){
        return "test";
    }
}
