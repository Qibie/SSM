package com.learn.ssm.chapter6.pojo;

/**
 * @ClassName Role
 * @Description
 * @Author qibie
 * @Date 11/2/18 4:37 PM
 */
public class Role {
    private String roleNo;
    private String roleName;
    private String note;

    public Role() {
    }

    public Role(String roleNo, String roleName, String note) {
        this.roleNo = roleNo;
        this.roleName = roleName;
        this.note = note;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
