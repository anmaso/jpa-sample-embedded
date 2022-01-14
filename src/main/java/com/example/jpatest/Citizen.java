package com.example.jpatest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citizen")
public class Citizen implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "age")
	private Long age;

	@Column(name = "name")
	private String name;

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Embedded
	private Address address;
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
//	@JoinColumns({
//	@JoinColumn(name="street", referencedColumnName = "street"),
//	@JoinColumn(name="number", referencedColumnName = "number")
//})

//	@ManyToOne
//	@JoinColumns({
//		@JoinColumn(name="street", referencedColumnName = "street"),
//		@JoinColumn(name="number", referencedColumnName = "number"),
//	})
//	@JoinColumnsOrFormulas({
//		@JoinColumnOrFormula(formula=@JoinFormula(value="street", referencedColumnName = "street")),
//		@JoinColumnOrFormula(formula=@JoinFormula(value="number", referencedColumnName = "number"))
//	})
//	City city;

}
