package com.example.redisdemo1.service;

import com.example.redisdemo1.dao.UserDao;
import com.example.redisdemo1.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "user")

public class UserService {

    @Resource
    private RedisTemplate redisTemplate;
    @Autowired
    private UserDao userDao;
    //插入
    public int insert(user u){
        return userDao.insert(u);
    };
    //删除
    public int delete(int id){
        return userDao.delete(id);
    };
    //修改
    public int update(user u){
        return userDao.update(u);
    };
    //查询all
    public List<user> query(){
        return userDao.query();
    };
    //条件查询
    public user queryby(int c){
        System.out.println("service:"+c);
        return (user) userDao.queryby(c);
    };
}
