package com.mm.dp.filter;

public class SecondFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		// TODO Auto-generated method stub
		String str = request.getRequestStr();
		str += "----second----";
		request.setRequestStr(str);
		chain.doFilter(request, response, chain);
		str = response.getResponseStr();
		str += "----second----";
		response.setResponseStr(str);

	}

}
