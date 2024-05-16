package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.Teacher;
import com.bezkoder.springjwt.payload.request.TeacherRequest;
import com.bezkoder.springjwt.security.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public ResponseEntity<?> addTeacher(@RequestBody TeacherRequest teacherRequest){
        return  teacherService.addTeacher(teacherRequest);

    }

    @GetMapping("/allTeacher")
    public ResponseEntity<List<Teacher>> getAllTeacher(){
        return teacherService.getAllTeacher();
    }


}
