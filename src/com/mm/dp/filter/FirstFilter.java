package com.mm.dp.filter;

public class FirstFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		String str = request.getRequestStr();
		str += "----first----";
		request.setRequestStr(str);
		chain.doFilter(request, response, chain);
		str = response.getResponseStr();
		str += "----first----";
		response.setResponseStr(str);
	}

}
