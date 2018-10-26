package com.learn.ssm.chapter4.enviroments.transactionmanager;

import org.apache.ibatis.session.TransactionIsolationLevel;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * @ClassName MyTransactionFactory
 * @Description
 * @Author qibie
 * @Date 10/25/18 10:43 PM
 */
public class MyTransactionFactory implements TransactionFactory {
    @Override
    public void setProperties(Properties properties) {

    }

    @Override
    public Transaction newTransaction(Connection conn) {
        return new MyTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new MyTransaction(dataSource, level,autoCommit);
    }
}
