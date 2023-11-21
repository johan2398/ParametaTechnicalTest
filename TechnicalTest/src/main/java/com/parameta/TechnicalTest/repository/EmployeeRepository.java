/**
 * 
 */
package com.parameta.TechnicalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parameta.TechnicalTest.entity.Employee;

/**
 * @author Johan Casagua
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
