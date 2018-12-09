package org.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)private Long id;
	private String libelle;
	private Long prix;
	private Set<Auction> auctions;
	private Category categories;
	
	
	public Product() {
		super();
	}
	
	
	public Product(String libelle, Long prix) {
		super();
		this.libelle = libelle;
		this.prix = prix;
	}

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	
	

    @OneToMany(mappedBy = "productP", cascade = CascadeType.ALL)
	public Set<Auction> getAuctions() {
		return auctions;
	}


	public void setAuctions(Set<Auction> auctions) {
		this.auctions = auctions;
	}
	

	@ManyToOne
    @JoinColumn(name = "category_id")
	public Category getCategories() {
		return categories;
	}


	public void setCategories(Category categories) {
		this.categories = categories;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", libelle=" + libelle + ", prix=" + prix + "]";
	}
	
	
	
	

}
