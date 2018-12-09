package org.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String typecategory;
	private Set<Product> products;

	public Category() {
		super();
	}

	public Category(String typecategory) {
		super();
		this.typecategory = typecategory;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypecategory() {
		return typecategory;
	}

	public void setTypecategory(String typecategory) {
		this.typecategory = typecategory;
	}
	

	
    @OneToMany(mappedBy = "categories", cascade = CascadeType.ALL)
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", typecategory=" + typecategory + "]";
	}
	
	
	

}
