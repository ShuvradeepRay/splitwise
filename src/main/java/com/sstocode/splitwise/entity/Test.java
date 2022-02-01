package com.sstocode.splitwise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
	
//	@Column(name = "col1")
	@Id
	private String col1;
	
//	@Column(name = "col2")
	private int col2;
	
	public int getCol2() {
		return col2;
	}

	public void setCol2(int col2) {
		this.col2 = col2;
	}

	public String getCol1() {
		return col1;
	}

	public void setCol1(String col1) {
		this.col1 = col1;
	}
	
	

}
