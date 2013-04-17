package com.mm.cow;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Farm.getInstance().passYears(20);
		System.out.println(Farm.getInstance().getNum());
	}

}
