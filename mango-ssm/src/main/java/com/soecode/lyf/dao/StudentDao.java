package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author 戴礼明
 * @Date 2018/3/15 17:12
 * @Description
 */

public interface StudentDao {

    int insertStudent(@Param("student") Student student, @Param("sql")String sql);

    int insertStudent1(@Param("student") Student student);

    void insertStudents(@Param("students") List<Student> students);
}
