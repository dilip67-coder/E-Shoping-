package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_Id")
	private Long id;
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID", referencedColumnName = "ID")
	
	private Category category;
	
	private double price;
	private double weight;
	private String description;
	private String imageName;
	
}
