package com.city81.betfair.service;

public class MarketFilter {

	private Filter filter;
	
	public MarketFilter(Filter filter) {
		this.filter = filter;
	}

	public Filter getFilter() {
		return this.filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}
		
}

