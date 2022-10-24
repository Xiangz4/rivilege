package com.xyf.quanxian_stu.Context;

import java.util.ArrayList;
import java.util.List;

public class apiContext {
    private static List<Integer> require = new ArrayList<>();
    public static List<Integer> getInstance(){
        return require;
    }

    //权限添加
    static {
        require.add(10);
    }

}
