/**
 * 
 */
package com.parameta.TechnicalTest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity from table "employee"
 * @author Johan Casagua
 */
@Entity
@Table(name = "employee")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private String names;
	
	private String lastNames;
	
	private String docType;
	
	private String docNumber;
	
	private Date birthDay;
	
	private Date hireDate;
	
	private String position;
	
	private Double salary;
}
