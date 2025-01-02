package com.web.project.domain;

import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserRespository {
	public int save(User user) throws Exception;
}
