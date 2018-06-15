package com.practice2;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	
	private Random random = new Random();
	@Override
	public String getFortune() {
		String[] forArray= {"You would be lucky today",
				"You would get promotion today",
				"You will meet someoone of old friends"};
		int index = random.nextInt(forArray.length);
		return forArray[index];
	}
}
