package com.yizheng.microservice.demo.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author yizheng
 * @date 2020/5/21 11:23
 */
@Setter
@Getter
@Slf4j
public class TbUser {

    private int id;

    private String username;

    private String address;

    public TbUser() {
    }

    public TbUser(Integer id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TbUser{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUser tbUser = (TbUser) o;
        return id == tbUser.id &&
                Objects.equals(username, tbUser.username) &&
                Objects.equals(address, tbUser.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, address);
    }
}





