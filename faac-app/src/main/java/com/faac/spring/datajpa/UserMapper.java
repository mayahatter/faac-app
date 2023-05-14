package com.faac.spring.datajpa;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.faac.spring.datajpa.model.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM users")
    public List <com.faac.spring.datajpa.model.User> findAll();

    @Select("SELECT * FROM users WHERE username = #{username}")
    public User findByUsername(String username);

    @Delete("DELETE FROM employees WHERE username = #{username}")
    public int deleteByUsername(String username);

    @Insert("INSERT INTO users(username, nome, cognome, email, telefono) " +
        " VALUES (#{username}, #{nome}, #{cognome}, #{email}, #{telefono})")
    public int insert(User user);

    @Update("UPDATE users set nome=#{nome}, " +
        " last_name=#{cognome}, email=#{email}, telefono=#{telefono} where username=#{username}")
    public int update(User user);
}