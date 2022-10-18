package com.xyf.quanxian_stu;

public class IprivillegeInfo {
    private int code;
    private static IprivillegeInfo info;
    public IprivillegeInfo Code(int code){
        this.code = code;
        return info;
    }
    public static IprivillegeInfo newInstance(){
        info = new IprivillegeInfo();

        return info;
    }
}
