package com.xyf.quanxian_stu;


import com.alibaba.ttl.TransmittableThreadLocal;
import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;
import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;

import java.util.*;

public class SecurityContext{
    //存储上下文ID
    private static final TransmittableThreadLocal<String> CONTEXT_ID = new TransmittableThreadLocal<>();

    //上下文线程池
    private static final Map<String,SecurityContextBean> CONTEXT_POOL = new HashMap<>();

    //线程与上下文ID映射表
    private static final Map<String,String> THREAD_2_CONTEXTID = new HashMap<>();

    //接口所需权限
    private static final Map<String,List<IprivillegeInfo>> API_REQUIRE = new HashMap<>();

    //权限定义以及添加
    static {
        IprivillegeInfo info = IprivillegeInfo.newInstance();
        ArrayList<IprivillegeInfo> list = new ArrayList<>();
        info.Code(1001);
        list.add(info);
        API_REQUIRE.put("teserivillege",list);
    }

    public static SecurityContextBean init(){
        SecurityContextBean bean = new SecurityContextBean();
        String ID = CONTEXT_ID.get();
        if (ID != null){
            return CONTEXT_POOL.get(ID);
        }else {
            ID = String.valueOf(UUID.randomUUID());
            CONTEXT_ID.set(ID);
            CONTEXT_POOL.put(ID,bean);
            //将线程ID 与 上下文 ID进行映射
            THREAD_2_CONTEXTID.put(String.valueOf(Thread.currentThread().getId()),ID);
            return bean;
        }
    }
    public static Map<String,String> getThread2Contextid(){
        return THREAD_2_CONTEXTID;
    }

    public static Map<String,SecurityContextBean> getContextPool(){
        return CONTEXT_POOL;
    }





}
