package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;
import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/test")
    public String teserivillege(){
        //首先创建一个属于自己的上下文对象
        SecurityContextBean bean = SecurityContext.init();
        Map<String, List<IprivillegeInfo>> Require_map = SecurityContext.getApiRequire();
        List<IprivillegeInfo> require_list = Require_map.get("teserivillege");
        Ownrivillege own = new Ownrivillege();
        List<IprivillegeInfo> ownlist = own.ownrivillege(1001);
        if (ownlist.size() != require_list.size()){
            return "权限不足";
        }else {
            for (int i = 0; i < require_list.size(); i++) {
                if (!require_list.contains(ownlist.get(i))){
                    return "权限不足";
                }
            }
            return "访问成功";
        }

    }



}
