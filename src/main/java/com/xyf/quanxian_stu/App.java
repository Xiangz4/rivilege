package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.core_interface.IPrivilege;
import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;
import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;

public class App {

    public static void main(String[] args) {
        IprivillegeAquier aquier = new Require();
        IprivillegeOwn own = new Ownrivillege();

        IPrivilege bs = PrivilegeBs.builder()
                .own(own)
                .aquier(aquier)
                .build();
        System.out.println(bs.func(null));
    }

}
