package com.learn.ssm.chapter5.main;

import com.learn.ssm.chapter5.mapper.EmployeeMapper;
import com.learn.ssm.chapter5.mapper.RoleMapper;
import com.learn.ssm.chapter5.mapper2.RoleMapper2;
import com.learn.ssm.chapter5.mapper2.UserMapper2;
import com.learn.ssm.chapter5.pojo.Employee;
import com.learn.ssm.chapter5.pojo.PageParams;
import com.learn.ssm.chapter5.pojo.Role;
import com.learn.ssm.chapter5.pojo.RoleParams;
import com.learn.ssm.chapter5.pojo2.Role2;
import com.learn.ssm.chapter5.pojo2.User2;
import com.learn.ssm.chapter5.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
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
        // testGetRoleUseResultMap();
        // testFindRolesByMap();
        // findRolesByAnnotation();
        // findRolesByBean();
        // findByMix();
        // testRowBounds();
        // testInsertRole();
        // testUpdateRole();
        // testDeleteRole();
        // testGetEmployee();
        // testGetEmployee2();
        // testUserRole();
        // testOneLevelCache();
        testOneLevelCache2();
    }

    public static void testGetRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role roleVo = new Role();
            roleVo.setId(1L);
            Role role = roleMapper.getRole(1L);
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

    private static void findRolesByAnnotation() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roleList = roleMapper.findRolesByAnnotation("1", "1");
            logger.info(roleList.get(0).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void findRolesByBean() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams roleParams = new RoleParams("1", "1");
            List<Role> roleList = roleMapper.findRolesByBean(roleParams);
            logger.info(roleList.get(0).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void findByMix() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams roleParams = new RoleParams("1", "1");
            PageParams pageParams = new PageParams();
            pageParams.setStart(0);
            pageParams.setLimit(1);
            List<Role> roleList = roleMapper.findByMix(roleParams, pageParams);
            logger.info(roleList.get(0).toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testRowBounds() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RowBounds rowBounds = new RowBounds(0, 20);
            List<Role> roleList = roleMapper.findByRowBounds("role_name", "note", rowBounds);
            logger.info(roleList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testInsertRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("role_test");
            role.setNote("note_test");
            int i = roleMapper.insertRole(role);
            sqlSession.commit();
            logger.info(role + "" + " i:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testUpdateRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("role_dest");
            role.setNote("note_dest");
            role.setId(11L);
            int i = roleMapper.updateRole(role);
            sqlSession.commit();
            logger.info(role + "" + " i:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    private static void testDeleteRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            int i = roleMapper.deleteRole(11L);
            sqlSession.commit();
            logger.info("i:" + i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testGetEmployee() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);
            logger.info("Employee birthday:" + employee.getBirthday());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testGetEmployee2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee2(1L);
            logger.info("Employee birthday:" + employee.getBirthday());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testUserRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper2 roleMapper2 = sqlSession.getMapper(RoleMapper2.class);
            Role2 role2 = roleMapper2.getRole(1L);
            logger.info(role2);
            UserMapper2 userMapper2 = sqlSession.getMapper(UserMapper2.class);
            User2 user2 = userMapper2.getUser(1L);
            logger.info(user2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testOneLevelCache() {
        SqlSession sqlSession = null;
        Logger logger = Logger.getLogger(Chapter5Main.class);
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            logger.info("再获取一次POJO......");
            Role role2 = roleMapper.getRole(1L);
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testOneLevelCache2() {
        SqlSession sqlSession = null;
        SqlSession sqlSession2 = null;
        Logger logger = Logger.getLogger(Chapter5Main.class);
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            sqlSession2 = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            // 需要提交，如果是一级缓存，MyBatis才会缓存对象到SqlSessionFactory层面
            sqlSession.commit();
            logger.info("不同sqlsession再获取一次POJO......");
            RoleMapper roleMapper2 = sqlSession2.getMapper(RoleMapper.class);
            Role role2 = roleMapper2.getRole(1L);
            // 需要提交，MyBatis才缓存对象到SqlSessionFactory
            sqlSession2.commit();
        } catch(Exception e) {
            logger.info(e.getMessage(), e);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (sqlSession2 != null) {
                sqlSession.close();
            }
        }
    }

}
