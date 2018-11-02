package com.learn.ssm.chapter5.param;

import com.learn.ssm.chapter5.pojo.Role;

import java.util.List;

/**
 * @ClassName PdFindRoleParams
 * @Description
 * @Author qibie
 * @Date 11/2/18 3:22 PM
 */
public class PdFindRoleParams {
    private String roleName;
    private int start;
    private int end;
    private int total;
    private List<Role> roleList;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
