package com.exa.entity;

import com.adc.da.base.entity.BaseEntity;


/**
 * <b>功能：</b>t_sys_user TSysUserEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-09-07 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class TSysUserEO extends BaseEntity {

    private Integer tUserId;
    private String tUserName;
    private String tUserPwd;
    private String tRole;
    private String tStatus;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>tUserId -> t_user_id</li>
     * <li>tUserName -> t_user_name</li>
     * <li>tUserPwd -> t_user_pwd</li>
     * <li>tRole -> t_role</li>
     * <li>tStatus -> t_status</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "tUserId": return "t_user_id";
            case "tUserName": return "t_user_name";
            case "tUserPwd": return "t_user_pwd";
            case "tRole": return "t_role";
            case "tStatus": return "t_status";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>t_user_id -> tUserId</li>
     * <li>t_user_name -> tUserName</li>
     * <li>t_user_pwd -> tUserPwd</li>
     * <li>t_role -> tRole</li>
     * <li>t_status -> tStatus</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "t_user_id": return "tUserId";
            case "t_user_name": return "tUserName";
            case "t_user_pwd": return "tUserPwd";
            case "t_role": return "tRole";
            case "t_status": return "tStatus";
            default: return null;
        }
    }
    
    /**  **/
    public Integer getTUserId() {
        return this.tUserId;
    }

    /**  **/
    public void setTUserId(Integer tUserId) {
        this.tUserId = tUserId;
    }

    /**  **/
    public String getTUserName() {
        return this.tUserName;
    }

    /**  **/
    public void setTUserName(String tUserName) {
        this.tUserName = tUserName;
    }

    /**  **/
    public String getTUserPwd() {
        return this.tUserPwd;
    }

    /**  **/
    public void setTUserPwd(String tUserPwd) {
        this.tUserPwd = tUserPwd;
    }

    /**  **/
    public String getTRole() {
        return this.tRole;
    }

    /**  **/
    public void setTRole(String tRole) {
        this.tRole = tRole;
    }

    /**  **/
    public String getTStatus() {
        return this.tStatus;
    }

    /**  **/
    public void setTStatus(String tStatus) {
        this.tStatus = tStatus;
    }

}
