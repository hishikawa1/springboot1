package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Member;

public interface MemberService {
	//create
	
	void addMember(Member m);
	
	//read
	Member LoginMember(String username,String password);
	boolean selectUsername(String username);
	List<Member> selectAllMember();
	
	

}