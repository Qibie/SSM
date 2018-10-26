package com.learn.ssm.chapter3;

import com.learn.ssm.chapter3.mapper.RoleMapper;
import com.learn.ssm.chapter3.pojo.Role;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName BuildSqlSessionFacotryByCode
 * @Description
 * @Author qibie
 * @Date 10/18/18 4:04 PM
 */
public class BuildSqlSessionFacotry {

    /**
     * XML type
     * @return SqlSessionFactory
     */
    public SqlSessionFactory BuildSqlSessionFacotoryByXML() {
        SqlSessionFactory SqlSessionFactory = null;
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SqlSessionFactory;
    }

    /**
     * Code type
     * @return
     */
    public SqlSessionFactory getBuildSqlSessionFacotryByCode() {
        // database connection pool
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
        dataSource.setDefaultAutoCommit(false);
        // use mybatis JDBC transaction way
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        // create Configuration object
        Configuration configuration = new Configuration(environment);
        // regist an alias for Mybatis context
        configuration.getTypeAliasRegistry().registerAlias("role", Role.class);
        // add a mapper
        configuration.addMapper(RoleMapper.class);
        // create SqlSessionFactory by SqlSessionFactoryBuilder
        SqlSessionFactory SqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        return SqlSessionFactory;
    }

}
