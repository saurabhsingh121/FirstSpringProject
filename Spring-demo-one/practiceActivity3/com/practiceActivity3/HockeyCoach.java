package com.practiceActivity3;

public class HockeyCoach implements Coach{
	
	private Tutor tutor;
	
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	@Override
	public String getSalary() {
		return "Coach! you will be getting 50 grand";
	}
	@Override
	public String getTution() {
		return tutor.getTution();
	}
}
