package com.notitime.noffice.global.response;

import org.springframework.http.HttpStatus;

public interface ErrorCode {
	HttpStatus getHttpStatus();

	String getCode();

	String getMessage();
}
