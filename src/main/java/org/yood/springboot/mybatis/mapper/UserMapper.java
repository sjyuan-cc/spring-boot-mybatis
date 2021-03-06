package org.yood.springboot.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.yood.springboot.mybatis.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserMapper {

    @Insert("insert into sbm_user(name, password, sex) values(#{name}, #{password}, #{sex})")
    void insert(User user) throws SQLException;

    @Select("select * from sbm_user")
    List<User> selectAll() throws SQLException;

    @Select("select * from sbm_user where name=#{1}")
    User selectByName(String username) throws SQLException;
}
