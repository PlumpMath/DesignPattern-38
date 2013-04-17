package com.mm.cow;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	private static  List<Cow> cows = new ArrayList<Cow>();
	private static final Farm farm = new Farm();
	static {
		cows.add(new Cow(5));
	}
	public static Farm getInstance() {
		return farm;
	}

	public void add() {
		cows.add(new Cow(0));
	}

	public int getNum() {
		return this.cows.size();
	}

	public void passYears(int year) {
		for (int i = 0; i < year; i++) {
			List<Cow> cow2=this.cows;
			for (int j=0;j<cow2.size();j++) {
				cow2.get(j).pass();
			}
		}

	}
}
