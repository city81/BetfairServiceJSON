package com.city81.betfair.service;

import com.betfair.publicapi.types.global.v3.LoginReq
import com.betfair.publicapi.types.global.v3.LoginResp
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService
import com.betfair.publicapi.v3.bfglobalservice.BFGlobalService_Service
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import groovy.json.JsonBuilder

class BetfairService {

	private final String sessionToken
	private final String applicationKey

	public BetfairService(String username, String password, String applicationKey) {
		BFGlobalService_Service globalService = new BFGlobalService_Service()
		def bfGlobalService = globalService.getBFGlobalService()
		LoginReq loginReq = new LoginReq()
		loginReq.setUsername(username)
		loginReq.setPassword(password)
		loginReq.setProductId(82)
		def loginResp = bfGlobalService.login(loginReq)
		this.sessionToken = loginResp.getHeader().getSessionToken()
		this.applicationKey = applicationKey
	}

	Set<CompetitionResult> listCompetitions(MarketFilter marketFilter) {

		def resultList = new ArrayList<CompetitionResult>()
		def builder = new JsonBuilder(marketFilter)
		def http = new HTTPBuilder( 'https://beta-api.betfair.com/json-rpc' )
 
		// POST request
		http.request (POST, JSON){req->
  			body = [
      				"jsonrpc" : "2.0",
      				"method" : "SportsAPING/v1.0/listCompetitions",
      				"params" : builder.toString(),
      				"id" : 1
  			]

  			headers.'X-Application' = this.applicationKey
  			headers.'X-Authentication' = this.sessionToken
 
  			// success response handler 
  			response.success = { resp, json ->
    				json.result.each {      
					resultList.add(new CompetitionResult(
					new Competition(it.competition.id, it.competition.name), 
					it.marketCount))
				}
  			}
 
  			// failure response handler 
  			response.failure = { resp ->
    				println "Unexpected error: ${resp.statusLine.statusCode}"
				println ${resp.statusLine.reasonPhrase}
  			}
		}
		return resultList
	}

	Set<EventTypeResult> listEventTypes(MarketFilter marketFilter) {
			
		def resultList = new ArrayList<EventTypeResult>()
		def builder = new JsonBuilder(marketFilter)
		def http = new HTTPBuilder( 'https://beta-api.betfair.com/json-rpc' )
 
		// POST request
		http.request (POST, JSON){req->
  			body = [
      				"jsonrpc" : "2.0",
      				"method" : "SportsAPING/v1.0/listEventTypes",
      				"params" : builder.toString(),
      				"id" : 1
  			]
       
  			headers.'X-Application' = this.applicationKey
  			headers.'X-Authentication' = this.sessionToken
 
  			// success response handler 
  			response.success = { resp, json ->
    				json.result.each {      
					resultList.add(new EventTypeResult(
					new EventType(it.eventType.id, it.eventType.name), 
					it.marketCount))
  				}
  			}
 
  			// failure response handler 
  			response.failure = { resp ->
    				println "Unexpected error: ${resp.statusLine.statusCode}"
                                println ${resp.statusLine.reasonPhrase}
			}
                }
		return resultList
        }

}

