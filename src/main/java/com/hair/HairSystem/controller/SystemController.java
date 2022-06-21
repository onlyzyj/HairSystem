package com.hair.HairSystem.controller;

import com.hair.HairSystem.pojo.system.LoginInfo;
import com.hair.HairSystem.service.system.LoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SystemController {

    @Autowired
    private LoginInfoService loginInfoService;

    @RequestMapping("index")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("userLogin")
    @ResponseBody
    public String userLogin(@RequestParam("username")String username, @RequestParam("password") String password, HttpServletRequest request){
        LoginInfo loginInfo = loginInfoService.loginQuery(username);
        System.out.println(loginInfo);
        if(loginInfo == null){
            return "no username";
        }else{
            if(loginInfo.getPassword().equals(password)){
                HttpSession session = request.getSession();
                session.setAttribute("user",loginInfo);
                return "go index";
            }else{
                return "error";
            }
        }
    }

    @RequestMapping("onlineMonitor")
    public String onlineMonitor(Model model){
        return "onlineMonitor";
    }

    @RequestMapping("profile")
    public String profile(Model model){
        return "profile";
    }

    @RequestMapping("edit_pwd")
    public String editPwd(Model model){
        return "edit_pwd";
    }

    @RequestMapping("onlineMonitorSearch")
    public String onlineMonitorSearch(Model model){
        return "onlineMonitorSearch";
    }

    @RequestMapping("valueChainUser")
    public String valueChainUser(Model model){
        return "valueChainUser";
    }

    @RequestMapping("valueChainStock")
    public String valueChainStock(Model model){
        return "valueChainStock";
    }

}
