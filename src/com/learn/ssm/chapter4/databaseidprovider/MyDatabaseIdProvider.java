package com.learn.ssm.chapter4.databaseidprovider;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName MyDatabaseIdProvider
 * @Description
 * @Author qibie
 * @Date 10/26/18 7:44 PM
 */
public class MyDatabaseIdProvider implements DatabaseIdProvider {

    private Logger log = Logger.getLogger(MyDatabaseIdProvider.class);

    private static final String DATEBASE_TYPE_DB2 = "DB2";
    private static final String DATEBASE_TYPE_MYSQL = "MYSQL";
    private static final String DATEBASE_TYPE_ORACLE = "Oracle";

    @Override
    public void setProperties(Properties properties) {
        log.info(properties);
    }

    @Override
    public String getDatabaseId(DataSource dataSource) throws SQLException {
        Connection connection = dataSource.getConnection();
        String dbProductName = connection.getMetaData().getDatabaseProductName();
        if (MyDatabaseIdProvider.DATEBASE_TYPE_DB2.equals(dbProductName)) {
            return "db2";
        } else if (MyDatabaseIdProvider.DATEBASE_TYPE_MYSQL.equals(dbProductName)) {
            return "mysql";
        } else if (MyDatabaseIdProvider.DATEBASE_TYPE_ORACLE.equals(dbProductName)) {
            return "oracle";
        } else {
            return null;
        }
    }
}
