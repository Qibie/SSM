package com.learn.ssm.chapter4.objectfactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Properties;

/**
 * @ClassName MyObjectFactory
 * @Description
 * @Author qibie
 * @Date 10/25/18 10:23 PM
 */
public class MyObjectFactory extends DefaultObjectFactory {

    private static final long serialVersionUID = -8484143376188656604L;
    
    Logger logger = Logger.getLogger(MyObjectFactory.class);
    
    private Object temp = null;
    
    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        logger.info("initializing:[" + properties.toString() + "]");
    }
    
    @Override
    public <T> T create(Class<T> type) {
        T result = super.create(type);
        logger.info("create object: " + result.toString());
        logger.info("is the same object compare to previous one:[" + (temp == result) + "]");
        return result;
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        T result = super.create(type, constructorArgTypes, constructorArgs);
        logger.info("create object: " + result.toString());
        temp = result;
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}