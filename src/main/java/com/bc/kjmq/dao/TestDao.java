package com.bc.kjmq.dao;

import com.bc.kjmq.dynamicds.DS;
import com.bc.kjmq.dynamicds.DSN;
import com.bc.kjmq.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestDao {

    @DS(value = DSN.DB_1)
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);

    @DS(value = DSN.DB_2)
    @Select("select * from user where name = #{name}")
    User findUserByName1(@Param("name") String name);
}
