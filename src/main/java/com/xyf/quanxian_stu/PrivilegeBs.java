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

    @Override
    public boolean func() {
//        List<IprivillegeInfo> aquier_List =
//        List<IprivillegeInfo> ownList =
//        if (aquier_List.size() != ownList.size()){
//            return false;
//        }else {
//            for (int i = 0; i < ownList.size(); i++) {
//                if (!aquier_List.contains(ownList.get(i))){
//                    return false;
//                }
//            }
//            return true;
//        }
        return false;
    }
    public static PrivilegeBs newInstance(){
        return PrivilegeBs.builder().build();
    }
}
