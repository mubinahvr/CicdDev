package com.bezkoder.springjwt.security.services;

import com.bezkoder.springjwt.models.Teacher;
import com.bezkoder.springjwt.payload.request.TeacherRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public ResponseEntity<?> addTeacher(TeacherRequest teacherRequest){
        Teacher tech = new Teacher(teacherRequest.getfName(),teacherRequest.getlName(),teacherRequest.getPhNo(),teacherRequest.getDept(),teacherRequest.getGender(),teacherRequest.getAadhaar(),teacherRequest.getDob(),teacherRequest.getPlaceOfBirth(),teacherRequest.getPan(),teacherRequest.getGrade(),teacherRequest.getAddress());
        teacherRepository.save(tech);
        return ResponseEntity.ok(new MessageResponse("Teacher Added Successfully"));
    }


    public ResponseEntity<List<Teacher>> getAllTeacher(){
        return ResponseEntity.ok(teacherRepository.findAll());
    }

}
