package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "user_profile")
public class UserProfile {

	@Id
	@Column(name = "user_profile_id", columnDefinition = "INT(11)")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer profile;

//	private int userId;
//
//	private int positionId;

//	@Column(name = "public_status", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT TRUE")
//	private String publicStatus;

//	@Column(name = "birthday", nullable = false, columnDefinition = "DATETIME")
//	@Temporal(TemporalType.DATE)
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
//	private Date birthday;

//	@Column(name = "full_name", nullable = false, columnDefinition = "VARCHAR(255)")
//	private String fullName;
//
//	@Column(name = "gender", nullable = false)
//	private String gender;

//	@Column(name = "branch", nullable = false, columnDefinition = "VARCHAR(255)")
//	private String branch;

//	@Column(name = "department", nullable = false, columnDefinition = "VARCHAR(255)")
//	private String department;

//	@Column(name = "number_phone", nullable = false, columnDefinition = "VARCHAR(11)")
//	private String numberPhone;

//	@Column(name = "facebook", nullable = false, columnDefinition = "VARCHAR(255)")
//	private String facebook;

//	@Column(name = "description", nullable = false, columnDefinition = "TEXT")
//	private String description;

//	@Column(name = "url_img_avatar", nullable = false, columnDefinition = "VARCHAR(255)")
//	private String imageAvatar;

//	@Column(name = "create_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
//	private Timestamp createdAt;
//
//	@Column(name = "update_at", nullable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
//	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
//	private Timestamp updateAt;

	public UserProfile() {

	}

	public UserProfile(Integer profile) {
		super();
		this.profile = profile;
	}

}
