package com.mm.dp.filter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilterChain chain=new FilterChain();
		chain.addFilter(new FirstFilter())
		.addFilter(new SecondFilter());
		Request request=new Request();
		request.setRequestStr("request");
		Response response=new Response();
		response.setResponseStr("response");
		chain.doFilter(request, response, chain);
		System.out.println(request);
		System.out.println(response);
	}

}
