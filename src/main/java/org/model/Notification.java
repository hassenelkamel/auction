package org.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Notification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String description;
	private Date dateDescription;
	private Manager managerM;
	
	
	
	public Notification() {
		super();
	}
	
	
	public Notification(String description, Date dateDescription, Manager managerM) {
		super();
		this.description = description;
		this.dateDescription = dateDescription;
		this.managerM = managerM;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDescription() {
		return dateDescription;
	}
	public void setDateDescription(Date dateDescription) {
		this.dateDescription = dateDescription;
	}

	@ManyToOne
	@JoinColumn(name="manager_id")
	public Manager getManagerM() {
		return managerM;
	}


	public void setManagerM(Manager managerM) {
		this.managerM = managerM;
	}
	
	


}
