package com.xyf.quanxian_stu.Controller;

import com.xyf.quanxian_stu.Context.GlobalContext;
import com.xyf.quanxian_stu.Context.SecurityContext;
import com.xyf.quanxian_stu.quanxian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    private quanxian quanxian;
    @RequestMapping("/test")
    public String testfunc(){
        SecurityContext securityContext = GlobalContext.getSecurityContext(Thread.currentThread());
        if (securityContext == null){
            SecurityContext securityContext1 = new SecurityContext();
            GlobalContext.setContext(Thread.currentThread(),securityContext1);
        }
        if (quanxian.is_ok()){
            return "访问成功";
        }
        return "权限不足，访问失败";
    }
}
