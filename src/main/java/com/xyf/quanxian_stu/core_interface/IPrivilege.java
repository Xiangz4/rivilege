package com.xyf.quanxian_stu.core_interface;

public interface IPrivilege {

    /**
     * {@code true} 表示拥有权限
     * {@code false} 表示没有权限
     * @param iprivillegeContext 上下文对象
     * @return
     */
    public boolean func(IprivillegeContext iprivillegeContext);

}
