package com.github.weChart.service;

import com.github.weChart.mapper.UserMapper;
import com.github.weChart.model.User;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenkaihua on 15-9-15.
 */
@Service
public class UserService  {

    @Autowired
    UserMapper userMapper;



    @RequiresRoles("admin")
    public void deleteWithAdminRoleById(int id){
        userMapper.deleteByPrimaryKey(id);
    }


    public User getUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }



    public boolean isExist(User user){
        System.out.println(user.toString());
        return  userMapper.selectCount(user)>0;
    }


    public void addUser(User user){
        userMapper.insert(user);
    }


    public List<User> getUsers(User user){
        if (user == null) {
            return userMapper.selectAll();
        }

        return userMapper.select(user);
    }


    public void deleteById(int id){
        userMapper.deleteByPrimaryKey(id);

    }

    public void update(User user){
        userMapper.updateByPrimaryKey(user);
    }


}
