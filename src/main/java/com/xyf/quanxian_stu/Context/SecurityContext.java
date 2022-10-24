package com.xyf.quanxian_stu.Context;

import java.util.ArrayList;
import java.util.List;

public class SecurityContext {
    private List<Integer> own = null;


    public SecurityContext(List<Integer> my_own){
        this.own = my_own;
    }

    public SecurityContext(Integer ...integers){
        own = new ArrayList<>();
        for (Integer integer : integers) {
            own.add(integer);
        }
    }

    public List<Integer> getown(){
        return own;
    }


}
