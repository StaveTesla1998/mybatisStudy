package com.qiji.mybatis.mapper;

import com.qiji.mybatis.pojo.Employ;

/**
 * @author Administrator
 */
public interface EmployMapper {
    Employ selectEmpById(Integer id);

    Employ selectEmpDepById(Integer id);
}
