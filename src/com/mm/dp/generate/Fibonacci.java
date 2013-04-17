package com.mm.dp.generate;

public class Fibonacci implements Generate<Integer>{
	
	private int size = 1;
	
	public int fib(int n){
		return n > 2 ? fib(n-2) + fib(n-1) : 1;
	}
	
	@Override
	public Integer next() {
		return fib(this.size++);
	}
	
	public static void main(String[] args) {
		Fibonacci fi = new Fibonacci();
		for(int i = 0;i<18;i++){
			System.out.print(fi.next() + " ");
		}
	}
}
