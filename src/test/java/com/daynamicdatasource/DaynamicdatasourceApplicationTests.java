package com.daynamicdatasource;

import com.daynamicdatasource.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaynamicdatasourceApplicationTests {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void testSimpleSelect() {
        Student student = studentDao.getStudent(1);
        assertNotNull(student);
        assertEquals(student.getName(),"jack");
    }
}

