package com.xyf.quanxian_stu.Context;

import java.util.concurrent.ConcurrentHashMap;

public class GlobalContext {
    //全局的
    private static ConcurrentHashMap<Thread,SecurityContext> contextMap = new ConcurrentHashMap<>();

    public static SecurityContext getSecurityContext(Thread thread){
        return contextMap.get(thread);
    }

    public static synchronized void setContext(Thread thread,SecurityContext securityContext){
        contextMap.put(thread,securityContext);
    }


}
