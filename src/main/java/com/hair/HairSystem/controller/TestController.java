package com.hair.HairSystem.controller;

import com.hair.HairSystem.pojo.Role;
import com.hair.HairSystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("allRole")
    public String allRole(Model model){
        //查询roles
        List<Role> roles = this.roleService.queryALl();
        //放入模型
        model.addAttribute("roles",roles);
        //返回模板/页面名称（就是classpath:/templates/目录下的html文件名）
        System.out.println(roles.get(0));
        return "roles";
    }

    @RequestMapping("zli")
    public String zli(Model model){
        return "zli";
    }

    @RequestMapping("test")
    public String test(Model model){
        return "test";
    }

    //ajax异步访问测试
    @RequestMapping("ajaxTest")
    @ResponseBody
    public String ajaxTest(Model model, @RequestParam("username") String username,@RequestParam("password") String password){
        if(username.equals(password)){
            return "equal";
        }else{
            return "different";
        }
    }


//    //json对象转化
//    @RequestMapping("getPieData")
//    @ResponseBody
//    public String getPieData(@RequestParam("charid") int id){
//        System.out.println(id);
//        PieData pieData = ChartUtil.getPieData();
//        Object obj = JSONArray.toJSON(pieData);
//        String json = obj.toString();
//        return json;
//    }
//
//    //json对象转化
//    @RequestMapping("getBarData")
//    @ResponseBody
//    public String getBarData(@RequestParam("charid") int id){
//        System.out.println(id);
//        BarData BarData = ChartUtil.getBarData();
//        String json = JSONArray.toJSON(BarData).toString();
//        System.out.println(json);
//        return json;
//    }
}
