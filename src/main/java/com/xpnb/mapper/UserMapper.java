package com.xpnb.mapper;

import com.xpnb.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user (username,password,userphone) values(#{username},#{password},#{userphone}) ")
    public  void save(User user);

    @Select("select * from user where username = #{username} and password = #{password}")
    User Identify(String username,String password);
}
