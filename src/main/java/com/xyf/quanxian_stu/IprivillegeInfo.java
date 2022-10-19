package com.xyf.quanxian_stu;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof IprivillegeInfo){
            IprivillegeInfo other = (IprivillegeInfo) obj;
            if (other.code == this.code){
                return true;
            }else {
                return false;
            }
        }

        return false;

    }
}
