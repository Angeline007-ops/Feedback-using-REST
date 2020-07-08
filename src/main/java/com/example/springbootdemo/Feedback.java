package com.example.springbootdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "feedback")
public class Feedback {
	   
		@Id	
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", unique = true, nullable = false)
		private int id;
	    @Column(name = "location",unique = true, nullable = false, length = 100)
		private String location;
	    @Column(name = "email",unique = true, nullable = false, length = 100)
		private String email;
		@Column(name = "name",unique = true, nullable = false, length = 100)
		private String name;
		@Column(name = "comments",unique = false, nullable = false, length = 100)
		private String comments;	
		
		
						
		
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String toString() {
			return "Feedback [id=" + id + ", location=" + location + ", email=" + email + ", name=" + name
					+ ", comments=" + comments + "]";
		}

		
		
		
}
