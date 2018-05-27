/**
 * 
 */
package com.coderslab.swagger.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	@ApiModelProperty(name = "Student Id", notes = "ID of the Student", required = true)
	private Integer id;

	@Column(name = "name", nullable = false, length = 200)
	@ApiModelProperty(name = "Student Name", notes = "Name of the Student", required = true)
	private String name;

	@Column(name = "marks")
	@ApiModelProperty(name = "Student Marks", notes = "Marks of the Student", required = true)
	private double marks;

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", nullable = false)
	@ApiModelProperty(name = "Student DOB", notes = "Date Of Birth of the Student", required = true)
	private Date dob;
}
