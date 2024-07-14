package com.example.demo.service;

import com.example.demo.model.Member;

public interface MemberService {
	//create
	
	void addMember(Member m);
	
	//read
	Member LoginMember(String username,String password);
	boolean selectUsername(String name);
	
	

}