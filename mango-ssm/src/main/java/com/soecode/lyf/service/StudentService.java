package com.soecode.lyf.service;


import com.soecode.lyf.entity.Student;

import java.util.List;

/**
 *
 */
public interface StudentService {

    int insertStudent(Student student);

    int insertStudent1(Student student);

    void insertStudents(List<Student> students);
}
