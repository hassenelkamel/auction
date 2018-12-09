package org.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int price;
	private Date datebid;
	private Client clientB;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Bid() {
		super();
	}
	
	
	public Bid(int price, Date datebid) {
		super();
		this.price = price;
		this.datebid = datebid;
	}


	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDatebid() {
		return datebid;
	}
	public void setDatebid(Date datebid) {
		this.datebid = datebid;
	}

	@ManyToOne
    @JoinColumn(name = "client_id")
	public Client getClientB() {
		return clientB;
	}


	public void setClientB(Client clientB) {
		this.clientB = clientB;
	}

	

	
	




}
