package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;

import java.util.Arrays;
import java.util.List;

public class Ownrivillege implements IprivillegeOwn {


    @Override
    public List<IprivillegeInfo> ownrivillege() {
        IprivillegeInfo one = IprivillegeInfo.newInstance().Code(1001);

        return Arrays.asList(one);
    }
}
