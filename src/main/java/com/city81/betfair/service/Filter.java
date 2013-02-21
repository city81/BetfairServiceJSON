package com.city81.betfair.service;

import java.util.Set;

public class Filter {

	private String textQuery;
	private Set<String> exchangeIds;
	private Set<String> eventTypeIds;
	private Set<String> eventIds;
	private Set<String> competitionIds;
	private Set<String> marketIds;
	private Set<String> venues;
	private boolean bspOnly;
	private boolean turnInPlayEnabled;
	private boolean inPlayOnly;
	//private Set<MarketBettingType> marketBettingTypes;
	private Set<String> marketCountries;
	private Set<String> marketTypeCodes;
	//private TimeRange marketStartTime;
	//private Set<OrderStatus> withOrders;
	
	public String getTextQuery() {
		return textQuery;
	}
	public void setTextQuery(String textQuery) {
		this.textQuery = textQuery;
	}
	public Set<String> getExchangeIds() {
		return exchangeIds;
	}
	public void setExchangeIds(Set<String> exchangeIds) {
		this.exchangeIds = exchangeIds;
	}
	public Set<String> getEventTypeIds() {
		return eventTypeIds;
	}
	public void setEventTypeIds(Set<String> eventTypeIds) {
		this.eventTypeIds = eventTypeIds;
	}
	public Set<String> getEventIds() {
		return eventIds;
	}
	public void setEventIds(Set<String> eventIds) {
		this.eventIds = eventIds;
	}
	public Set<String> getCompetitionIds() {
		return competitionIds;
	}
	public void setCompetitionIds(Set<String> competitionIds) {
		this.competitionIds = competitionIds;
	}
	public Set<String> getMarketIds() {
		return marketIds;
	}
	public void setMarketIds(Set<String> marketIds) {
		this.marketIds = marketIds;
	}
	public Set<String> getVenues() {
		return venues;
	}
	public void setVenues(Set<String> venues) {
		this.venues = venues;
	}
	public boolean isBspOnly() {
		return bspOnly;
	}
	public void setBspOnly(boolean bspOnly) {
		this.bspOnly = bspOnly;
	}
	public boolean isTurnInPlayEnabled() {
		return turnInPlayEnabled;
	}
	public void setTurnInPlayEnabled(boolean turnInPlayEnabled) {
		this.turnInPlayEnabled = turnInPlayEnabled;
	}
	public boolean isInPlayOnly() {
		return inPlayOnly;
	}
	public void setInPlayOnly(boolean inPlayOnly) {
		this.inPlayOnly = inPlayOnly;
	}
//	public Set<MarketBettingType> getMarketBettingTypes() {
//		return marketBettingTypes;
//	}
//	public void setMarketBettingTypes(Set<MarketBettingType> marketBettingTypes) {
//		this.marketBettingTypes = marketBettingTypes;
//	}
	public Set<String> getMarketCountries() {
		return marketCountries;
	}
	public void setMarketCountries(Set<String> marketCountries) {
		this.marketCountries = marketCountries;
	}
	public Set<String> getMarketTypeCodes() {
		return marketTypeCodes;
	}
	public void setMarketTypeCodes(Set<String> marketTypeCodes) {
		this.marketTypeCodes = marketTypeCodes;
	}
//	public TimeRange getMarketStartTime() {
//		return marketStartTime;
//	}
//	public void setMarketStartTime(TimeRange marketStartTime) {
//		this.marketStartTime = marketStartTime;
//	}
//	public Set<OrderStatus> getWithOrders() {
//		return withOrders;
//	}
//	public void setWithOrders(Set<OrderStatus> withOrders) {
//		this.withOrders = withOrders;
//	}	
	
}

