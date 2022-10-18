package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.IprivillegeInfo;
import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;

import java.util.Arrays;
import java.util.List;

public class Require implements IprivillegeAquier {
    @Override
    public List<IprivillegeInfo> aqrivillege() {
        IprivillegeInfo one = IprivillegeInfo.newInstance().Code(1001);
        IprivillegeInfo two = IprivillegeInfo.newInstance().Code(1002);
        return Arrays.asList(one,two);
    }

    public static void main(String[] args) {
        Require require = new Require();
        require.aqrivillege();
    }
}
