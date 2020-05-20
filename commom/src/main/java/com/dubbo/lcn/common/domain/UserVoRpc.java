package com.dubbo.lcn.common.domain;

import java.io.Serializable;

/**
 * @author wuzongzhao
 * @date 2020/5/18 10:51
 */
public class UserVoRpc implements Serializable {
    private static final long serialVersionUID = -67299653549379991L;
    private String userName;
    private String phone;
    private String sex;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
