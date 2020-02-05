package com.vamshi.spring;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "you are a Super Hero";
	}

}
