package com.mm.dp.strategy;

public class DataSorter {

	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		int b;
		for (int i = a.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					b = a[j];
					a[j] = a[j + 1];
					a[j + 1] = b;
				}
			}
		}
		return a;
	}

	public void p(int[] a) {
		// TODO Auto-generated method stub
		for (int i : a) {
			System.out.println(i);
		}
	}

}
