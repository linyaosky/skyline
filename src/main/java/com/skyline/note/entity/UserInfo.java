package com.skyline.note.entity;

import java.util.Date;

public class UserInfo {
    private String userId;

    private String userName;

    private String password;

    private Date registerTime;

    private Double registerIp;

    private Date lastLoginTime;

    private Double lastLoginIp;

    private String loginCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Double getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(Double registerIp) {
        this.registerIp = registerIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Double getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(Double lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(String loginCount) {
        this.loginCount = loginCount == null ? null : loginCount.trim();
    }
}