package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.core_interface.IPrivilege;
import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;
import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;

public class App {

    public void test(){
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }
    public static void main(String[] args) {
        App app = new App();
        app.test();
    }



}
