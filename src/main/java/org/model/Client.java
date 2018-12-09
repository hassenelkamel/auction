package org.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@DiscriminatorValue("3")
public class Client extends Personne{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String userName;
	private String passWord;
	private Set<Bid> bids;
	private Auction auctionA;
	private Forum forumF;
	

	public Client() {
		super();
	}
	
	



	public Client(String userName, String passWord, Set<Bid> bids, Auction auction, Forum forum) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.bids = bids;
		this.auctionA = auction;
		this.forumF = forum;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Auction getAuctionA() {
		return auctionA;
	}





	public void setAuctionA(Auction auctionA) {
		this.auctionA = auctionA;
	}





	public Forum getForumF() {
		return forumF;
	}





	public void setForumF(Forum forumF) {
		this.forumF = forumF;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
    @OneToMany(mappedBy = "clientB", cascade = CascadeType.ALL)
	public Set<Bid> getBids() {
		return bids;
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "auction_id")
	public Auction getAuction() {
		return auctionA;
	}

	public void setAuction(Auction auction) {
		this.auctionA = auction;
	}
	
	

    @ManyToOne
    @JoinColumn(name = "forum_id")
	public Forum getForum() {
		return forumF;
	}

	public void setForum(Forum forum) {
		this.forumF = forum;
	}

	@Override
	public String toString() {
		
	      String result = String.format(
	                "Client[id=%d, name='%s']%n",
	                id, userName);
	        if (bids != null) {
	            for(Bid bid : bids) {
	                result += String.format(
	                        "Book[id=%d, name='%s',date='%s']%n",
	                        bid.getId(), bid.getPrice(),bid.getDatebid().toString());
	            }
	        }

	        return result;
	}

	
	
	

}
