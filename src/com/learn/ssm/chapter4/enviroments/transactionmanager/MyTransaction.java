package com.learn.ssm.chapter4.enviroments.transactionmanager;

import org.apache.ibatis.session.TransactionIsolationLevel;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName MyTransaction
 * @Description
 * @Author qibie
 * @Date 10/25/18 10:44 PM
 */
public class MyTransaction extends JdbcTransaction implements Transaction {
    public MyTransaction(Connection connection) {
        super(connection);
    }

    public MyTransaction(DataSource ds, TransactionIsolationLevel level, boolean autoCommit) {
        super(ds, level, autoCommit);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return super.getConnection();
    }

    @Override
    public void commit() throws SQLException {
        super.commit();
    }

    @Override
    public void rollback() throws SQLException {
        super.rollback();
    }

    @Override
    public void close() throws SQLException {
        super.close();
    }

    @Override
    public Integer getTimeout() throws SQLException {
        return super.getTimeout();
    }
}
