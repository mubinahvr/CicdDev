package com.bezkoder.springjwt;

import com.bezkoder.springjwt.models.Student;
import com.bezkoder.springjwt.repository.StudentRepository;
import com.bezkoder.springjwt.security.services.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringBootSecurityJwtApplicationTests {

//    @Test
//    public void contextLoads() {
//    }

    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepository;

@Test
    public void getAllStudentsTest() {
        when(studentRepository.findAll()).thenReturn(Stream.of(new Student("Shivanand",
                "Pujari",
                "OMkar",
                "Sharanamma",
                "shiva@gmail.com",
                "1998-06-14",
                "9148071519",
                "Male",
                "Hindu",
                "Kuruba",
                "236936673519",
                "At post srichand",
                "23685945",
                "Govt High School Srichand",
                "A"),new Student("Shivanand",
                "Pujari",
                "OMkar",
                "Sharanamma",
                "shiva@gmail.com",
                "1998-06-14",
                "9148071519",
                "Male",
                "Hindu",
                "Kuruba",
                "236936673519",
                "At post srichand",
                "23685945",
                "Govt High School Srichand",
                "A")).collect(Collectors.toList()));
        assertEquals(2, studentService.getAllStudents().size(), "The students should be 8");
    }


}
