package org.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="forum")
public class Forum {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String faq;
	private String chat;
	private Set<Client> clients;
	public Forum() {
		super();
	}
	public Forum(String faq, String chat) {
		super();
		this.faq = faq;
		this.chat = chat;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFaq() {
		return faq;
	}
	public void setFaq(String faq) {
		this.faq = faq;
	}
	public String getChat() {
		return chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}
	
    @OneToMany(mappedBy = "forumF", cascade = CascadeType.ALL)
	public Set<Client> getClients() {
		return clients;
	}
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	


}
