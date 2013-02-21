package com.city81.betfair.service;

public class EventTypeResult {

	private EventType eventType;
	private int marketCount;
	
	public EventTypeResult(EventType eventType, int marketCount) {
		this.eventType = eventType;
		this.marketCount = marketCount;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public int getMarketCount() {
		return marketCount;
	}

	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
		
}

