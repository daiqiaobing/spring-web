package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.StudentDao;
import com.soecode.lyf.entity.Student;
import com.soecode.lyf.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 戴礼明
 * @Date 2018/3/15 21:23
 * @Description
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student, "id,");
    }

    @Override
    public int insertStudent1(Student student) {
        return studentDao.insertStudent1(student);
    }

    @Override
    public void insertStudents(List<Student> students) {
        studentDao.insertStudents(students);
    }

}
