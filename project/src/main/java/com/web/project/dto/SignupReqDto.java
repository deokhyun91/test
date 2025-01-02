package com.web.project.dto;

import com.web.project.domain.User;

import lombok.Data;

@Data
public class SignupReqDto {

	private int num;
	private String name;
	private String id;
	private String phone;
	
	
	public User toEntity() {
		return User.builder()
					.num(num)
					.name(name)
					.id(id)
					.phone(phone)
					.build();
	}
}
