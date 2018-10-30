package com.learn.ssm.chapter5.pojo;

/**
 * @ClassName RoleParams
 * @Description
 * @Author qibie
 * @Date 10/30/18 1:22 PM
 */
public class RoleParams {
    private String roleName;
    private String note;

    public RoleParams(String roleName, String note) {
        this.roleName = roleName;
        this.note = note;
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
