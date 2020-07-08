package com.example.springbootdemo;

import java.util.ArrayList;

//import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.MyRepository;


@Service
public class TestService implements MyRepository{

	@Autowired
	private MyRepository repo;
	
	 private static List<Feedback> al = new ArrayList<Feedback>();
	    
	 public  TestService() 
	 {		 
	 }
	 
	
	public boolean addResponse(String name, String email, String location, String comments)
	{
		 Feedback e = new Feedback();
		 e.setName(name);
		 e.setEmail(email);
		 e.setLocation(location);
		 e.setComments(comments);		 
		 e.toString();		
		 al.toString();
		 al.add(0, (Feedback) e);
		 repo.saveAll(al);
		 repo.toString();
		 		 
		 System.out.println("Thanks for the feedback!!");
		 return true;
	 }

	@Override
	public <S extends Feedback> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Feedback> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return entities;
	}

	@Override
	public Optional<Feedback> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Feedback> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Feedback> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count( ) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Feedback entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Feedback> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
	
}
