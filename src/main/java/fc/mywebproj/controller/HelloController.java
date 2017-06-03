package main.java.fc.mywebproj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by guruihang on 2017/6/1.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/helloworld/stringway")
    @ResponseBody
    public String getHelloPage(){
        System.out.println("im in!!");
        return "hello";
    }

    @RequestMapping(value = "/helloworld/jsp")
    @ResponseBody
    public ModelAndView getHelloHtml(){
        System.out.println("im in!!~hello jsp");
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("time", new Date());
        mav.getModel().put("name", "FlowingCloud");

        return mav;
    }
    @RequestMapping(value = "/helloworld/jsp2")
    @ResponseBody
    public ModelAndView getHelloHtml2(){
        System.out.println("im in!!~hello jsp");
        ModelAndView mav = new ModelAndView("hello.jsp");
        mav.addObject("time", new Date());
        mav.getModel().put("name", "FlowingCloud");

        return mav;
    }
}
