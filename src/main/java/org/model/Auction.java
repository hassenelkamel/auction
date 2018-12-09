package org.model;

import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "auction")
public class Auction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String startDate;
	private int price;
	private int duration;
	private int lotnumber;
	private String stat;
	private Set<Client> clients;
	private Product productP;
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	
	public Auction() {
		super();
	}
	
	
	public Auction(String startDate, int price, int duration, int lotnumber, String stat) {
		super();
		this.startDate = startDate;
		this.price = price;
		this.duration = duration;
		this.lotnumber = lotnumber;
		this.stat = stat;
	}


	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getLotnumber() {
		return lotnumber;
	}
	public void setLotnumber(int lotnumber) {
		this.lotnumber = lotnumber;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	
    @OneToMany(mappedBy = "auctionA", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	public Set<Client> getClients() {
		return clients;
	}


	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	
	

	@ManyToOne
    @JoinColumn(name = "product_id")
	public Product getProductP() {
		return productP;
	}


	public void setProductP(Product productP) {
		this.productP = productP;
	}


	@Override
	public String toString() {
		return "Auction [id=" + id + ", startDate=" + startDate + ", price=" + price + ", duration=" + duration
				+ ", lotnumber=" + lotnumber + ", stat=" + stat + "]";
	}
	
	
	
	

}
