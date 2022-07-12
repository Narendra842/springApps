package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
     @Id
	 private Integer sid;
	 private String sname;
	 private String saddress;
	 private String scourse;
	 private String scity;
}
