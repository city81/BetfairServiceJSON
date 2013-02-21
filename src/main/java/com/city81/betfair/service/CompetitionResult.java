package com.city81.betfair.service;

public class CompetitionResult {

	private Competition competition;
	private int marketCount;
	
	public CompetitionResult(Competition competition, int marketCount) {
		this.competition = competition;
		this.marketCount = marketCount;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public int getMarketCount() {
		return marketCount;
	}

	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}
		
}

