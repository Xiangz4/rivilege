package com.xyf.quanxian_stu;

import com.xyf.quanxian_stu.core_interface.IPrivilege;
import com.xyf.quanxian_stu.core_interface.IprivillegeAquier;
import com.xyf.quanxian_stu.core_interface.IprivillegeContext;
import com.xyf.quanxian_stu.core_interface.IprivillegeOwn;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
public class PrivilegeBs implements IPrivilege {
    //需要的权限和拥有的权限
    private  IprivillegeAquier aquier;
    private  IprivillegeOwn own;

    @Override
    public boolean func(IprivillegeContext iprivillegeContext) {
        List<IprivillegeInfo> aquier_List = aquier.aqrivillege();
        List<IprivillegeInfo> ownList = own.ownrivillege();
        if (aquier_List.size() != ownList.size()){
            return false;
        }else {
            for (int i = 0; i < ownList.size(); i++) {
                if (!aquier_List.contains(ownList.get(i))){
                    return false;
                }
            }
            return true;
        }
    }
    public void require(IprivillegeAquier aquier){
        this.aquier = aquier;
    }
    public void own(IprivillegeOwn own){
        this.own = own;
    }
    public static PrivilegeBs newInstance(){
        return PrivilegeBs.builder().build();
    }
}
