package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;
import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class SecurityContextBean {
    //所需要的权限
    private static  List<IprivillegeAquier> AQUIER_LIST = new ArrayList<>();

    //目前上下文所拥有的权限
    private static  List<IprivillegeOwn> OWN_LIST = new ArrayList<>();

    public  List<IprivillegeAquier> getAquierList() {
        return AQUIER_LIST;
    }

    public  void setAquierList(List<IprivillegeAquier> aquierList) {
        AQUIER_LIST = aquierList;
    }

    public  List<IprivillegeOwn> getOwnList() {
        return OWN_LIST;
    }

    public  void setOwnList(List<IprivillegeOwn> ownList) {
        OWN_LIST = ownList;
    }
}
