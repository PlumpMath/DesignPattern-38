package com.mm.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	List<Filter> filters=new ArrayList<Filter>();
	private int index=0;
	@Override
	public void doFilter(Request request,Response response,FilterChain chain) {
		// TODO Auto-generated method stub
		if(index==filters.size()) return;
		Filter filter=filters.get(index);
		index++;
		filter.doFilter(request, response, chain);
	}
	
	public FilterChain addFilter (Filter filter){
		filters.add(filter);
		return this;
	}
}
