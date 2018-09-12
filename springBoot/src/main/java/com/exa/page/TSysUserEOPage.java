package com.exa.page;

import com.adc.da.base.page.BasePage;


/**
 * <b>功能：</b>t_sys_user TSysUserEOPage<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-09-07 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class TSysUserEOPage extends BasePage {

    private String tUserId;
    private String tUserIdOperator = "=";
    private String tUserName;
    private String tUserNameOperator = "=";
    private String tUserPwd;
    private String tUserPwdOperator = "=";
    private String tRole;
    private String tRoleOperator = "=";
    private String tStatus;
    private String tStatusOperator = "=";

    public String getTUserId() {
        return this.tUserId;
    }

    public void setTUserId(String tUserId) {
        this.tUserId = tUserId;
    }

    public String getTUserIdOperator() {
        return this.tUserIdOperator;
    }

    public void setTUserIdOperator(String tUserIdOperator) {
        this.tUserIdOperator = tUserIdOperator;
    }

    public String getTUserName() {
        return this.tUserName;
    }

    public void setTUserName(String tUserName) {
        this.tUserName = tUserName;
    }

    public String getTUserNameOperator() {
        return this.tUserNameOperator;
    }

    public void setTUserNameOperator(String tUserNameOperator) {
        this.tUserNameOperator = tUserNameOperator;
    }

    public String getTUserPwd() {
        return this.tUserPwd;
    }

    public void setTUserPwd(String tUserPwd) {
        this.tUserPwd = tUserPwd;
    }

    public String getTUserPwdOperator() {
        return this.tUserPwdOperator;
    }

    public void setTUserPwdOperator(String tUserPwdOperator) {
        this.tUserPwdOperator = tUserPwdOperator;
    }

    public String getTRole() {
        return this.tRole;
    }

    public void setTRole(String tRole) {
        this.tRole = tRole;
    }

    public String getTRoleOperator() {
        return this.tRoleOperator;
    }

    public void setTRoleOperator(String tRoleOperator) {
        this.tRoleOperator = tRoleOperator;
    }

    public String getTStatus() {
        return this.tStatus;
    }

    public void setTStatus(String tStatus) {
        this.tStatus = tStatus;
    }

    public String getTStatusOperator() {
        return this.tStatusOperator;
    }

    public void setTStatusOperator(String tStatusOperator) {
        this.tStatusOperator = tStatusOperator;
    }

}
