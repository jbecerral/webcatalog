package com.demo.model;

public class Product {
	private String id;
	private String name;
	private String description;
	private String authorId;
	private float price;

	public  Product() {
	}

	public Product(String id, String name, String description, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}	
	
	public Product(String id, String name, String description, String authorId, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.authorId = authorId;
		this.price = price;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = description;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}
