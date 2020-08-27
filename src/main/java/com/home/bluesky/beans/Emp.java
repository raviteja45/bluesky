package com.home.bluesky.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Emp {
	
	@PrimaryKey
	private String emp_id;
	
	private String emp_city;
	
	private String emp_name;
	
	private String emp_phone;
	
	private String emp_sal;

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_city() {
		return emp_city;
	}

	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_phone() {
		return emp_phone;
	}

	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}

	public String getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(String emp_sal) {
		this.emp_sal = emp_sal;
	}
	
	

}
