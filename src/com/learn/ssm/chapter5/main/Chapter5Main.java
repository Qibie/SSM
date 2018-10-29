package com.learn.ssm.chapter5.main;

import com.learn.ssm.chapter5.mapper.RoleMapper;
import com.learn.ssm.chapter5.pojo.Role;
import com.learn.ssm.chapter5.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Chapter5Main
 * @Description
 * @Author qibie
 * @Date 10/29/18 4:21 PM
 */
public class Chapter5Main {

    private static Logger logger = Logger.getLogger(Chapter5Main.class);

    public static void main(String[] args) {
        // testGetRole();
        testGetRoleUseResultMap();
        // testFindRolesByMap();

    }

    public static void testGetRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role roleVo = new Role();
            roleVo.setId(1L);
            Role role = roleMapper.getRole(roleVo);
            logger.info(role + "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testGetRoleUseResultMap() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRoleUseResultMap(1L);
            logger.info(role + "");
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRolesByMap() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Map<String, Object> parameterMap = new HashMap<>();
            parameterMap.put("roleName", "1");
            parameterMap.put("note", "1");
            Role role = roleMapper.findRolesByMap(parameterMap);
            logger.info(role);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
