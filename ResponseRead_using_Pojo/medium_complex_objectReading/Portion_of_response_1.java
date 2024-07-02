// IN THIS PREOGRAM WE ARE READING A PORTION FROM NESTED JSON.. OBJECT...

package medium_complex_objectReading;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Portion_of_response_1 
{
	public static void main(String [] args) throws IOException
	{
		ObjectMapper objmpr = new ObjectMapper();
		String str ="{\r\n" + 
				"    \"request\": {\r\n" + 
				"        \"airline\": {\r\n" + 
				"            \"fsCode\": \"AA\",\r\n" + 
				"            \"requestedCode\": \"AA\"\r\n" + 
				"        },\r\n" + 
				"        \"flight\": {\r\n" + 
				"            \"requested\": \"100\",\r\n" + 
				"            \"interpreted\": \"100\"\r\n" + 
				"        },\r\n" + 
				"        \"utc\": {\r\n" + 
				"            \"requested\": \"false\",\r\n" + 
				"            \"interpreted\": false\r\n" + 
				"        },\r\n" + 
				"        \"url\": \"https://api.flightstats.com/flex/flightstatus/rest/v2/json/flight/status/AA/100/dep/2019/10/1?utc=false\",\r\n" + 
				"        \"nonstopOnly\": {\r\n" + 
				"            \"interpreted\": false\r\n" + 
				"        },\r\n" + 
				"        \"date\": {\r\n" + 
				"            \"year\": \"2019\",\r\n" + 
				"            \"month\": \"10\",\r\n" + 
				"            \"day\": \"1\",\r\n" + 
				"            \"interpreted\": \"2019-10-01\"\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"appendix\": {\r\n" + 
				"        \"airlines\": [\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"AA\",\r\n" + 
				"                \"iata\": \"AA\",\r\n" + 
				"                \"icao\": \"AAL\",\r\n" + 
				"                \"name\": \"American Airlines\",\r\n" + 
				"                \"phoneNumber\": \"08457-567-567\",\r\n" + 
				"                \"active\": true\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"AY\",\r\n" + 
				"                \"iata\": \"AY\",\r\n" + 
				"                \"icao\": \"FIN\",\r\n" + 
				"                \"name\": \"Finnair\",\r\n" + 
				"                \"phoneNumber\": \"+ 358 600 140 140\",\r\n" + 
				"                \"active\": true\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"IB\",\r\n" + 
				"                \"iata\": \"IB\",\r\n" + 
				"                \"icao\": \"IBE\",\r\n" + 
				"                \"name\": \"Iberia\",\r\n" + 
				"                \"phoneNumber\": \"1800 772 4642\",\r\n" + 
				"                \"active\": true\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"LY\",\r\n" + 
				"                \"iata\": \"LY\",\r\n" + 
				"                \"icao\": \"ELY\",\r\n" + 
				"                \"name\": \"El Al\",\r\n" + 
				"                \"phoneNumber\": \"+ 972-3-9771111\",\r\n" + 
				"                \"active\": true\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"BA\",\r\n" + 
				"                \"iata\": \"BA\",\r\n" + 
				"                \"icao\": \"BAW\",\r\n" + 
				"                \"name\": \"British Airways\",\r\n" + 
				"                \"phoneNumber\": \"1-800-AIRWAYS\",\r\n" + 
				"                \"active\": true\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"GF\",\r\n" + 
				"                \"iata\": \"GF\",\r\n" + 
				"                \"icao\": \"GFA\",\r\n" + 
				"                \"name\": \"Gulf Air\",\r\n" + 
				"                \"phoneNumber\": \"973 17 335 777\",\r\n" + 
				"                \"active\": true\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"airports\": [\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"LHR\",\r\n" + 
				"                \"iata\": \"LHR\",\r\n" + 
				"                \"icao\": \"EGLL\",\r\n" + 
				"                \"faa\": \"\",\r\n" + 
				"                \"name\": \"London Heathrow Airport\",\r\n" + 
				"                \"city\": \"London\",\r\n" + 
				"                \"cityCode\": \"LON\",\r\n" + 
				"                \"stateCode\": \"EN\",\r\n" + 
				"                \"countryCode\": \"GB\",\r\n" + 
				"                \"countryName\": \"United Kingdom\",\r\n" + 
				"                \"regionName\": \"Europe\",\r\n" + 
				"                \"timeZoneRegionName\": \"Europe/London\",\r\n" + 
				"                \"weatherZone\": \"\",\r\n" + 
				"                \"localTime\": \"2019-10-01T15:25:25.492\",\r\n" + 
				"                \"utcOffsetHours\": 1.0,\r\n" + 
				"                \"latitude\": 51.469603,\r\n" + 
				"                \"longitude\": -0.453566,\r\n" + 
				"                \"elevationFeet\": 80,\r\n" + 
				"                \"classification\": 1,\r\n" + 
				"                \"active\": true,\r\n" + 
				"                \"weatherUrl\": \"https://api.flightstats.com/flex/weather/rest/v1/json/all/LHR?codeType=fs\",\r\n" + 
				"                \"delayIndexUrl\": \"https://api.flightstats.com/flex/delayindex/rest/v1/json/airports/LHR?codeType=fs\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"fs\": \"JFK\",\r\n" + 
				"                \"iata\": \"JFK\",\r\n" + 
				"                \"icao\": \"KJFK\",\r\n" + 
				"                \"faa\": \"JFK\",\r\n" + 
				"                \"name\": \"John F. Kennedy International Airport\",\r\n" + 
				"                \"street1\": \"JFK Airport\",\r\n" + 
				"                \"city\": \"New York\",\r\n" + 
				"                \"cityCode\": \"NYC\",\r\n" + 
				"                \"stateCode\": \"NY\",\r\n" + 
				"                \"postalCode\": \"11430\",\r\n" + 
				"                \"countryCode\": \"US\",\r\n" + 
				"                \"countryName\": \"United States\",\r\n" + 
				"                \"regionName\": \"North America\",\r\n" + 
				"                \"timeZoneRegionName\": \"America/New_York\",\r\n" + 
				"                \"weatherZone\": \"NYZ178\",\r\n" + 
				"                \"localTime\": \"2019-10-01T10:25:25.493\",\r\n" + 
				"                \"utcOffsetHours\": -4.0,\r\n" + 
				"                \"latitude\": 40.642335,\r\n" + 
				"                \"longitude\": -73.78817,\r\n" + 
				"                \"elevationFeet\": 13,\r\n" + 
				"                \"classification\": 1,\r\n" + 
				"                \"active\": true,\r\n" + 
				"                \"weatherUrl\": \"https://api.flightstats.com/flex/weather/rest/v1/json/all/JFK?codeType=fs\",\r\n" + 
				"                \"delayIndexUrl\": \"https://api.flightstats.com/flex/delayindex/rest/v1/json/airports/JFK?codeType=fs\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"equipments\": [\r\n" + 
				"            {\r\n" + 
				"                \"iata\": \"77W\",\r\n" + 
				"                \"name\": \"Boeing 777-300ER\",\r\n" + 
				"                \"turboProp\": false,\r\n" + 
				"                \"jet\": true,\r\n" + 
				"                \"widebody\": true,\r\n" + 
				"                \"regional\": false\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				"    \"flightStatuses\": [\r\n" + 
				"        {\r\n" + 
				"            \"flightId\": 1016157813,\r\n" + 
				"            \"carrierFsCode\": \"AA\",\r\n" + 
				"            \"flightNumber\": \"100\",\r\n" + 
				"            \"departureAirportFsCode\": \"JFK\",\r\n" + 
				"            \"arrivalAirportFsCode\": \"LHR\",\r\n" + 
				"            \"departureDate\": {\r\n" + 
				"                \"dateUtc\": \"2019-10-01T22:15:00.000Z\",\r\n" + 
				"                \"dateLocal\": \"2019-10-01T18:15:00.000\"\r\n" + 
				"            },\r\n" + 
				"            \"arrivalDate\": {\r\n" + 
				"                \"dateUtc\": \"2019-10-02T05:20:00.000Z\",\r\n" + 
				"                \"dateLocal\": \"2019-10-02T06:20:00.000\"\r\n" + 
				"            },\r\n" + 
				"            \"status\": \"S\",\r\n" + 
				"            \"schedule\": {\r\n" + 
				"                \"flightType\": \"J\",\r\n" + 
				"                \"serviceClasses\": \"RFJY\",\r\n" + 
				"                \"restrictions\": \"\",\r\n" + 
				"                \"uplines\": [],\r\n" + 
				"                \"downlines\": []\r\n" + 
				"            },\r\n" + 
				"            \"operationalTimes\": {\r\n" + 
				"                \"publishedDeparture\": {\r\n" + 
				"                    \"dateUtc\": \"2019-10-01T22:15:00.000Z\",\r\n" + 
				"                    \"dateLocal\": \"2019-10-01T18:15:00.000\"\r\n" + 
				"                },\r\n" + 
				"                \"scheduledGateDeparture\": {\r\n" + 
				"                    \"dateUtc\": \"2019-10-01T22:15:00.000Z\",\r\n" + 
				"                    \"dateLocal\": \"2019-10-01T18:15:00.000\"\r\n" + 
				"                },\r\n" + 
				"                \"estimatedGateDeparture\": {\r\n" + 
				"                    \"dateUtc\": \"2019-10-01T22:15:00.000Z\",\r\n" + 
				"                    \"dateLocal\": \"2019-10-01T18:15:00.000\"\r\n" + 
				"                },\r\n" + 
				"                \"publishedArrival\": {\r\n" + 
				"                    \"dateUtc\": \"2019-10-02T05:20:00.000Z\",\r\n" + 
				"                    \"dateLocal\": \"2019-10-02T06:20:00.000\"\r\n" + 
				"                },\r\n" + 
				"                \"scheduledGateArrival\": {\r\n" + 
				"                    \"dateUtc\": \"2019-10-02T05:20:00.000Z\",\r\n" + 
				"                    \"dateLocal\": \"2019-10-02T06:20:00.000\"\r\n" + 
				"                },\r\n" + 
				"                \"estimatedGateArrival\": {\r\n" + 
				"                    \"dateUtc\": \"2019-10-02T05:20:00.000Z\",\r\n" + 
				"                    \"dateLocal\": \"2019-10-02T06:20:00.000\"\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"codeshares\": [\r\n" + 
				"                {\r\n" + 
				"                    \"fsCode\": \"AY\",\r\n" + 
				"                    \"flightNumber\": \"4012\",\r\n" + 
				"                    \"relationship\": \"L\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"fsCode\": \"BA\",\r\n" + 
				"                    \"flightNumber\": \"1511\",\r\n" + 
				"                    \"relationship\": \"L\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"fsCode\": \"GF\",\r\n" + 
				"                    \"flightNumber\": \"6654\",\r\n" + 
				"                    \"relationship\": \"L\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"fsCode\": \"IB\",\r\n" + 
				"                    \"flightNumber\": \"4218\",\r\n" + 
				"                    \"relationship\": \"L\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"fsCode\": \"LY\",\r\n" + 
				"                    \"flightNumber\": \"8051\",\r\n" + 
				"                    \"relationship\": \"L\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"delays\": {},\r\n" + 
				"            \"flightDurations\": {\r\n" + 
				"                \"scheduledBlockMinutes\": 425\r\n" + 
				"            },\r\n" + 
				"            \"airportResources\": {\r\n" + 
				"                \"departureTerminal\": \"8\",\r\n" + 
				"                \"departureGate\": \"16\",\r\n" + 
				"                \"arrivalTerminal\": \"3\"\r\n" + 
				"            },\r\n" + 
				"            \"flightEquipment\": {\r\n" + 
				"                \"scheduledEquipmentIataCode\": \"77W\",\r\n" + 
				"                \"actualEquipmentIataCode\": \"77W\",\r\n" + 
				"                \"tailNumber\": \"N730AN\"\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
		
			JsonNode jsnd = objmpr.readTree(str);
			List<JsonNode> jsnd1 = jsnd.findValue("appendix").findValue("airlines").findValues("name");
			//String str11 = ((JsonNode) jsnd1).asText();
					
			System.out.println("This is json node format ---"+jsnd1);
			System.out.println(jsnd1.size());
			
			for (JsonNode jsonNode : jsnd1) 
			{
					System.out.println(jsonNode);
					String str11 = jsonNode.asText();
						System.out.println("-------------------"+str11);
					
			}
			//System.out.println("This is string format ---"+str11);
			
			//json
	}

}
