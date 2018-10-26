package com.learn.ssm.chapter4.main;

import com.learn.ssm.chapter4.mapper.RoleMapper;
import com.learn.ssm.chapter4.mapper.UserMapper;
import com.learn.ssm.chapter4.pojo.Role;
import com.learn.ssm.chapter4.pojo.User;
import com.learn.ssm.chapter4.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * @ClassName Chapter4Main
 * @Description
 * @Author qibie
 * @Date 10/18/18 9:05 PM
 */
public class Chapter4Main {
    public static void main(String[] args) {
        testRoleMapper();
        // testTypeHandler();
    }

    private static void testRoleMapper() {
        Logger log = Logger.getLogger(Chapter4Main.class);
        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            RoleMapper roleMapper = (RoleMapper)sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            log.info(role.getRoleName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }

    }

    private static void testTypeHandler() {
        Logger log = Logger.getLogger(Chapter4Main.class);
        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();
            UserMapper userMapper = (UserMapper)sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1L);
            log.info(user.getSex().getName());
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
    }
}
