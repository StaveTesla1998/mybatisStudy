package com.qiji.mybatis.mapper;

import com.qiji.mybatis.pojo.Employ;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface EmployMapper {
    Employ selectEmpById(Integer id);

    Employ selectEmpDepById(Integer id);

    /**
     * 通过Foreach关键字批量添加
     * @param employs
     */
    void insertByForeach(@Param("employs") List<Employ> employs);
}
