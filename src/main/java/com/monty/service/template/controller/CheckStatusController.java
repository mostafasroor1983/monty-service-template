package com.monty.service.template.controller;

import com.monty.api.rest.resource.CheckStatusApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckStatusController implements CheckStatusApi
{
	@Override
	public ResponseEntity<String> checkStatus()
	{
		return ResponseEntity.ok("Ok");
	}
}
