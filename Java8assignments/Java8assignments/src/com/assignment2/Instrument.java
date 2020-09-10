package com.assignment2;

public class Instrument implements Piano,Guitar{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Instruments play");
	}
	public static void main(String args[]) {
		Instrument instru=new Instrument();
		instru.play();
	}
	

}
