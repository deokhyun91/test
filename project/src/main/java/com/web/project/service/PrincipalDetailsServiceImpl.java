package com.web.project.service;

import org.springframework.stereotype.Service;

import com.web.project.domain.UserRespository;
import com.web.project.dto.SignupReqDto;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor        
public class PrincipalDetailsServiceImpl implements PrincilpalDetailsService{
	
	private final UserRespository userRespository;
	
	public boolean addUser(SignupReqDto signupReqDto) throws Exception{
		System.out.println("서비스단:" + signupReqDto);
		return userRespository.save(signupReqDto.toEntity()) > 0;
		
	}
}
