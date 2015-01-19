package com.channelsoft.springmvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.beans.Transient;
import java.util.Date;
import java.util.List;

/**
 * Created by yuanshun on 2015/1/19.
 */
@Entity
@Table(name = "ss_user")
public class User {
    private String longinName;
    private String name;
    private String plainPassword;
    private String password;
    private String salt;
    private String roles;
    private Date registerDate;

    @NotBlank
    public void setLonginName(String longinName) {
        this.longinName = longinName;
    }

    @NotBlank
    public void setName(String name) {
        this.name = name;
    }

    @Transient
    @JsonIgnore
    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getLonginName() {

        return longinName;
    }

    public String getName() {
        return name;
    }

    public String getPlainPassword() {
        return plainPassword;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getRoles() {
        return roles;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    @Transient
    @JsonIgnore
    public List<String> getRoleList() {
        // 角色列表在数据库中实际以逗号分隔字符串存储，因此返回不能修改的List.
        return ImmutableList.copyOf(StringUtils.split(roles, ","));
    }
}
