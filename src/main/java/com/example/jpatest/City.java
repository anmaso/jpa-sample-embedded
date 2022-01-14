package com.example.jpatest;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Embedded
	Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}

	@Column(insertable = false, updatable = false)
	String street;
	
	@Column(insertable = false, updatable = false)
	Long number;

	@OneToMany
	@JoinColumns({
		@JoinColumn(name = "street", referencedColumnName = "street"),
		@JoinColumn(name = "number", referencedColumnName = "number") })
	Set<Citizen> citizens;
	public Set<Citizen> getCitizens() {
		return citizens;
	}

	public void setCitizens(Set<Citizen> citizens) {
		this.citizens = citizens;
	}

}
