package com.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name="productId")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="type")
	private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product() {
		super();
	}
	public Product(String id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	
	
	
	
}
