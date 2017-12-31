package com.test.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class SignInController {

    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/products.do", method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products/products";
    }

    @RequestMapping(value = "/contactus.do", method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "contactus";
    }


}
