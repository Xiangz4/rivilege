package com.xyf.quanxian_stu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/test")
    public long teserivillege(){
        //首先创建一个属于自己的上下文对象
        SecurityContextBean bean = SecurityContext.init();
        return 1L;
    }

}
