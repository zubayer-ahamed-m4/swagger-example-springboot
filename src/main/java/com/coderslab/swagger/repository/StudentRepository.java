/**
 * 
 */
package com.coderslab.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderslab.swagger.model.Student;

/**
 * @author Zubayer Ahamed
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
