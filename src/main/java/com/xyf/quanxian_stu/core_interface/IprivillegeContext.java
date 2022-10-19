package com.xyf.quanxian_stu.core_interface;

public interface IprivillegeContext {

    /**
     * 拥有的权限
     * @return
     */
    IprivillegeOwn Own(IprivillegeOwn iprivillegeOwn);

    /**
     * 需要的权限
     * @return
     */
    IprivillegeAquier require(IprivillegeAquier iprivillegeAquier);

}
