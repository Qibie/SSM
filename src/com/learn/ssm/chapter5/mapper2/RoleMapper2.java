package com.learn.ssm.chapter5.mapper2;


import com.learn.ssm.chapter5.pojo2.Role2;

import java.util.List;

public interface RoleMapper2 {
	
	public Role2 getRole(Long id);
	
	public List<Role2> findRoleByUserId(Long userId);
}
