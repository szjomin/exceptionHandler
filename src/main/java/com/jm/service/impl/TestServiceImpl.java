package com.jm.service.impl;

import org.springframework.stereotype.Service;

import com.jm.service.TestService;


@Service
public class TestServiceImpl implements TestService {

	@Override
	public boolean test() {

		int a = 1 / 0;

		return true;
	}

}
