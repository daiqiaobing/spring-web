package com.soecode.lyf.web;

import com.soecode.lyf.entity.Student;
import com.soecode.lyf.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.stylesheets.LinkStyle;
import sun.misc.Request;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 戴礼明
 * @Date 2018/3/15 21:26
 * @Description
 */

@Controller
@RequestMapping("/")
public class StudentController {

    @Resource
    private StudentService studentService;

    private final Logger logger = LoggerFactory.getLogger(StudentController.class);

    /**
     * 测试Mybatis插入数据获取自增主键
     * @param student
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    @ResponseBody
    public String insertStudent(Student student){
        studentService.insertStudent(student);
        String msg = "插入的主键id为：" + student.getId();
        logger.error(msg);
        return msg;
    }

    /**
     * 测试Mybatis插入数据获取自增主键
     * @param student
     * @return
     */
    @RequestMapping(value = "/insert1", method = RequestMethod.GET)
    @ResponseBody
    public String insertStudent1(Student student){
        studentService.insertStudent1(student);
        String msg = "插入的主键id为：" + student.getId();
        logger.error(msg);
        return msg;
    }

    @RequestMapping(value = "/inserts", method = RequestMethod.POST)
    @ResponseBody
    public List<Student> insertStudents(@RequestBody List<Student> students){
        studentService.insertStudents(students);
        logger.error("ok");
        return students;
    }




}
