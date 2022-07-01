package com.springsecurity.group.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POSTS")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;
    private String subject;
    private String description;
    private String userName;
    @Enumerated(EnumType.STRING)
    private PostStatus status;
    
	public Post() {
		super();
	}	
	
	public Post(String subject, String description, String userName, PostStatus status) {
		super();
		this.subject = subject;
		this.description = description;
		this.userName = userName;
		this.status = status;
	}



	public Post(int postId, String subject, String description, String userName, PostStatus status) {
		super();
		this.postId = postId;
		this.subject = subject;
		this.description = description;
		this.userName = userName;
		this.status = status;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public PostStatus getStatus() {
		return status;
	}

	public void setStatus(PostStatus status) {
		this.status = status;
	}
	
	

    
}
