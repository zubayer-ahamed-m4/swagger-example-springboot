/**
 * 
 */
package com.coderslab.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderslab.swagger.model.Student;
import com.coderslab.swagger.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Zubayer Ahamed
 *
 */
@RestController
@RequestMapping("/rest/student/")
@Api(value = "Student Rest Endpoint", description = "Student Operations")
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@ApiOperation(value = "Add Student Info")
	@ApiResponses(value = {
		@ApiResponse(code = 143, message = "143 is for Success"),
		@ApiResponse(code = 420, message = "420 is for Exception")
	})
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.save(student);
	}

	@ApiOperation(value = "Get Student Info By ID")
	@ApiResponses(value = {
		@ApiResponse(code = 143, message = "143 is for Success"),
		@ApiResponse(code = 420, message = "420 is for Exception")
	})
	@GetMapping("/find/{id}")
	public Student findStudent(@PathVariable Integer id) {
		return studentService.findOne(id);
	}

	@ApiOperation(value = "Update Student Info")
	@ApiResponses(value = {
		@ApiResponse(code = 143, message = "143 is for Success"),
		@ApiResponse(code = 420, message = "420 is for Exception")
	})
	@PostMapping("/update")
	public Student updateStudent(Student student) {
		return studentService.save(student);
	}

	@ApiOperation(value = "Delete Student Info By ID")
	@ApiResponses(value = {
		@ApiResponse(code = 143, message = "143 is for Success"),
		@ApiResponse(code = 420, message = "420 is for Exception")
	})
	@GetMapping("/delete/{id}")
	public boolean deleteStudent(@PathVariable Integer id) {
		studentService.delete(id);
		return true;
	}

	@ApiOperation(value = "Get All Student Info")
	@ApiResponses(value = {
		@ApiResponse(code = 143, message = "143 is for Success"),
		@ApiResponse(code = 420, message = "420 is for Exception")
	})
	@GetMapping("/findAll")
	public List<Student> findAllStudent() {
		return studentService.findAll();
	}

}
