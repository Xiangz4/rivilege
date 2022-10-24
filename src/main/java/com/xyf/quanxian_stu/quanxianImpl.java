package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.Context.GlobalContext;
import com.xyf.quanxian_stu.Context.SecurityContext;
import com.xyf.quanxian_stu.Context.apiContext;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class quanxianImpl implements quanxian{
    @Override
    public boolean is_ok() {
        SecurityContext securityContext = GlobalContext.getSecurityContext(Thread.currentThread());
        List<Integer> own = securityContext.getown();
        List<Integer> require = apiContext.getInstance();

        if (own.size() != require.size()){
            return false;
        }
        for (int i = 0; i < own.size(); i++) {
            if (!require.contains(own.get(i))){
                return false;
            }
        }
        return true;
    }
}
