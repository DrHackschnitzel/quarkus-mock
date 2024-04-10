package org.example;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class GreetingResourceTest
{
	@InjectMock
	private BusinessService mock = Mockito.mock(BusinessService.class);
	
	@Test
	void testHelloEndpoint()
	{
		Mockito.doThrow(new RuntimeException()).when(mock).greet();
		given().when().get("/hello").then().statusCode(500);
	}

}
