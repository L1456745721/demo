package com.example.redisdemo1.dao;

import com.example.redisdemo1.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;


import java.util.List;

@Mapper
@CacheConfig(cacheNames = "myquery")
public interface UserDao {
    //插入
    int insert(user u);
    //删除
    @CacheEvict
    int delete(int id);
    //修改
    @CachePut
    int update(user u);
    //查询all
    @Cacheable
    List<user> query();
    //条件查询
    @Cacheable(keyGenerator = "mykeygen")
    user queryby(int u);
}


