package com.learn.ssm.chapter6.main;

import com.learn.ssm.chapter6.mapper.RoleMapper;
import com.learn.ssm.chapter6.pojo.Role;
import com.learn.ssm.chapter6.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Chapter6Main
 * @Description
 * @Author qibie
 * @Date 11/2/18 4:41 PM
 */
public class Chapter6Main {
    private static Logger logger = Logger.getLogger(Chapter6Main.class);

    public static void main(String[] args) {
        // testFindRole1();
        // testFindRole2();
        // testFindRole3();
        // testFindRole4();
        // updateRole();
        // updateRole1();
        // testFindRoleByNums();
        // testGetRoleTest();
        // bind property
        testFindRole5();
        // bind many params
        testFindRole6();
    }

    private static void testFindRole1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roleList = roleMapper.findRole1("");
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRole2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role("", "1", "1");
            List<Role> roleList = roleMapper.findRole2(role);
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRole3() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role("", "1", "1");
            List<Role> roleList = roleMapper.findRole3(role);
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRole4() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roleList = roleMapper.findRole4("");
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void updateRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role("1", "1", "1");
            roleMapper.updateRole(role);
            sqlSession.commit(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void updateRole1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role("2", "2", "1");
            roleMapper.updateRole1(role);
            sqlSession.commit(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRoleByNums() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<String> roleNoList = new ArrayList<>();
            roleNoList.add("1");
            roleNoList.add("2");
            roleNoList.add("3");
            List<Role> roleList = roleMapper.findRoleByNums(roleNoList);
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testGetRoleTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roleList = roleMapper.getRoleTest("y");
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRole5() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roleList = roleMapper.findRole5("1");
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testFindRole6() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roleList = roleMapper.findRole6("", "");
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
