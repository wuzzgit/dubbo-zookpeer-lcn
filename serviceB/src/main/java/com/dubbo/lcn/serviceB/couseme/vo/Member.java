package com.dubbo.lcn.serviceB.couseme.vo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

/**
 * @author wuzongzhao
 * @date 2020/5/18 15:50
 */
public class Member implements Serializable {
    private static final long serialVersionUID = -6167912730683837362L;

    private Integer userId;
    private String isVip;//是否是VIP

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }
}
