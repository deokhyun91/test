package com.web.project.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.project.dto.CMRespDto;
import com.web.project.dto.SignupReqDto;
import com.web.project.service.PrincipalDetailsServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthController {

	private final PrincipalDetailsServiceImpl principalDetailsService;
	
	@PostMapping("/")
	public ResponseEntity<?> signUp(@RequestBody SignupReqDto signupReqDto){
		System.out.println(signupReqDto);
		boolean status = false;
		try {
			status = principalDetailsService.addUser(signupReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1, "회원가입실패", status));
		}
		
		System.out.println(signupReqDto);
		return ResponseEntity.ok().body(new CMRespDto<>(1, "회원가입성공", status));
		
		
	}
}
