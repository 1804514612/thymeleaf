package com.me.controller;

import com.me.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class MyController {
    @GetMapping("/indexPage")
    public String indexPage(Model model) {
        model.addAttribute("mess", "hello");
        User user = new User();
        user.setAge(25);
        user.setId(1);
        user.setName("我就是我");
        model.addAttribute("user", user);
        User user1 = new User();
        user1.setAge(251);
        user1.setId(11);
        user1.setName("我就是我1");
        User user2 = new User();
        user2.setAge(25);
        user2.setId(12);
        user2.setName("我就是我2");
        List list = new ArrayList();
        list.add(user);
        list.add(user1);
        list.add(user2);
        model.addAttribute("list", list);
        Map map = new HashMap();
        map.put("pic", "1.jpg");
        map.put("pic2", "2.jpg");
        model.addAttribute("map", map);
        model.addAttribute("data", new Date());
        double num = 3.1415926;
        model.addAttribute("num", num);
        String str = "wefdsadfsasws" +
                "第三节疯狂送快递反馈说撒地方哈克斯卡萨" +
                "sdfkdfsdf" +
                "aaAAA";
        model.addAttribute("str", str);
        System.out.println("进来了");
        return "index";
    }
}
