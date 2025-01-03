package com.web.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CMRespDto<T> {

	private int code;
	private String message;
	private T data;
}
