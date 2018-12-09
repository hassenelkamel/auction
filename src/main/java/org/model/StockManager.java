package org.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockmanager")
@DiscriminatorValue("5")

public class StockManager extends Personne{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	
	public StockManager() {
		super();
	}
	
	

	public StockManager(Long id, String userName, String passWord) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "StockManager [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

	

}
