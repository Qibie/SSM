package com.learn.ssm.chapter3.main;

import com.learn.ssm.chapter3.BuildSqlSessionFacotry;
import com.learn.ssm.chapter3.mapper.RoleMapper;
import com.learn.ssm.chapter3.mapper.RoleMapper2;
import com.learn.ssm.chapter3.pojo.Role;
import com.learn.ssm.chapter3.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * @ClassName Chapter4Main
 * @Description
 * @Author qibie
 * @Date 10/18/18 9:05 PM
 */
public class Chapter3Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Chapter3Main.class);
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlsession();

            /** build SqlSessionFactory by confugiration way */
            // BuildSqlSessionFacotry buildSqlSessionFacotry = new BuildSqlSessionFacotry();
            // sqlSession = buildSqlSessionFacotry.getBuildSqlSessionFacotryByCode().openSession();

            /** send SQL by getting Mapper interface  */
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            logger.info(role.getRoleName());

            /** Annotation way and remember to add <mapper class/> in mybatis-config.xml**/
            // RoleMapper2 roleMapper2 = sqlSession.getMapper(RoleMapper2.class);
            // Role role2 = roleMapper2.getRole(1L);
            // logger.info("Role2: " + role2.toString());

            /** send SQL by SqlSeesion */
            // role = (Role) sqlSession.selectOne("com.learn.ssm.chapter3.mapper.RoleMapper.getRole", 1L);
            // logger.info("send SQL by SqlSeesion: " + role);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
