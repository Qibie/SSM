package com.learn.ssm.chapter5.mapper;

import com.learn.ssm.chapter5.pojo.Task;

/**
 * @ClassName TaskMapper
 * @Description
 * @Author qibie
 * @Date 10/30/18 7:55 PM
 */
public interface TaskMapper {
    Task getTask(Long id);
}
