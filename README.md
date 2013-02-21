BetfairServiceNew
=================

Provides an API to the new RPC-JSON Beta Betfair Web Service using Java and Groovy.

Currently the below services have been 'wrapped':

listCompetitions
listEventTypes 

More services will be added as and when time permits. Also more fields will 
be added to the MarketFilter class.


## Usage: ##


To create the service:

    def betfairService = new BetfairService("username","password","applicationKey")



To call the listCompetitions service method pass in a MarketFilter object:

eg. where event type ids are 1 or 2:

    def filter = new Filter()  
    filter.setEventTypeIds([1,2] as Set)  
    def marketFilter = new MarketFilter(filter)  
    def resultList = betfairService.listCompetitions(marketFilter)

this will return a collection of CompetitionResult objects for all the Soccer and Tennis events.


eg. where event type ids is 1, and where competition ids are 41 or 43:

    def filter = new Filter()  
    filter.setEventTypeIds([1] as Set)  
    filter.setCompetitionIds([41,43] as Set)  
    def marketFilter = new MarketFilter(filter)  
    def resultList = betfairService.listCompetitions(marketFilter)

this will return a collection of CompetitionResult objects for all the Soccer events where the competition ids are 41 or 43 ie only the CompetitionResult objects for the Blue Square North and Blue Square South would be returned.


eg. for all competitions, pass an empty filter:

    def filter = new Filter()  
    def marketFilter = new MarketFilter(filter)  
    def resultList = betfairService.listCompetitions(marketFilter)

this will return a collection of CompetitionResult objects for all competitions.


The same approach can be used to call listEventTypes.


NOTE: Will eventually format correctly and move the above to the Wiki!


