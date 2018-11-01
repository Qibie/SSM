package com.learn.ssm.chapter5.mapper2;


import com.learn.ssm.chapter5.pojo2.User2;

import java.util.List;

public interface UserMapper2 {
	
    public User2 getUser(Long id);
    
    public List<User2> findUserByRoleId(Long roleId);
}
