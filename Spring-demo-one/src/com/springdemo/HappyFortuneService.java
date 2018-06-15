package com.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	
	@Override
	public String getFortune() {
		String[] fortuneArray = {"This is your lucky day",
				"You are going to get promotion today",
				"You will meet someone today"};
		Random random = new Random();
		int index = random.nextInt(fortuneArray.length);
		return fortuneArray[index];
	}
}
