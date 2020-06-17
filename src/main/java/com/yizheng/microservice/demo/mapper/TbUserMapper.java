package com.yizheng.microservice.demo.mapper;

import com.yizheng.microservice.demo.dao.TbUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yizheng
 * @date 2020/5/21 11:27
 */

@Mapper
public interface TbUserMapper {

    @Select("select * from tb_user")
    List<TbUser> getAllUsers();

    @Delete("delete from tb_user where id = #{id}")
    void deleteUser(Integer id);

}
