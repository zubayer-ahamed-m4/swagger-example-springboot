/**
 * 
 */
package com.coderslab.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderslab.swagger.model.Student;
import com.coderslab.swagger.repository.StudentRepository;

/**
 * @author Zubayer Ahamed
 *
 */
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findOne(Integer id) {
		return studentRepository.findOne(id);
	}

	public void delete(Integer id) {
		studentRepository.delete(id);
	}

}
