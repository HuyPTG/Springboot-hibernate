package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserProfile;

@Repository
@Transactional
public class UserProfileDAO extends AbstractDAO<UserProfile>{

	public UserProfileDAO() {
		super(UserProfile.class);
		// TODO Auto-generated constructor stub
	}
	
//	@Autowired
//	private SessionFactory factory;
//	
//	public void saveUserProfile(UserProfile userProfile) {
//		getSession().save(userProfile);
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<UserProfile> getUserProfile(){
//		return getSession().createCriteria(UserProfile.class).list();
//	}
//	
//	private Session getSession() {
//		Session session = factory.getCurrentSession();
//		if(session==null) {
//			session=factory.openSession();
//		}
//		return session;
//	}

	
	
}
