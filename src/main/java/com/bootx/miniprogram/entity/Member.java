package com.bootx.miniprogram.entity;

import com.bootx.entity.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity

@Table(name = "zhaocha_member")
public class Member extends BaseEntity<Long> {

    @NotNull
    @Column(nullable = false,updatable = false,unique = true)
    private String openId;

    @ManyToOne
    @NotNull
    @JoinColumn(updatable = false,nullable = false)
    private App app;

    @ManyToOne
    @NotNull
    @JoinColumn(nullable = false)
    private MemberRank memberRank;

    private String nickName;

    private String sessionKey;

    private String token;

    private String unionid;

    private Integer gender;

    private String city;

    private String province;

    private String country;

    private String avatarUrl;

    @Column(nullable = false, precision = 27, scale = 12)
    private BigDecimal money;

    @NotNull
    @Column(nullable = false)
    private Integer gameLevel;








    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public MemberRank getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(MemberRank memberRank) {
        this.memberRank = memberRank;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(Integer gameLevel) {
        this.gameLevel = gameLevel;
    }
}
