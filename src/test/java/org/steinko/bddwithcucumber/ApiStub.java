package org.steinko.bddwithcucumber;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;


public class ApiStub {

	public static void deposit(Integer amount) {
		String sAmount = amount.toString();
		String url =  "http://localhost:8080/deposit/" + sAmount;	
	   	   
	   	   given()
	       .when()
	          .put(url)
	       .then()
	         .statusCode(200); 
		
	}

	public static void withdraw(Integer amount) {
		String sAmount = amount.toString();
		String url =  "http://localhost:8080/withdraw/" + sAmount;	
	   	   
	   	   given()
	       .when()
	          .put(url)
	       .then()
	         .statusCode(200); 
		
		
	}

	public static Integer dispenced() {
		String url =  "http://localhost:8080/dispence";	
	   	   
		Response response = 
				given().  
				when().
				        get(url).
				then().
				        contentType("application/json").
				        statusCode(200).
				extract().
				        response(); 

	        
		return response.body().as(Integer.class);
	}

	public static Integer balance() {
		
		String url =  "http://localhost:8080/balance";	
	   	   
		Response response = 
				given().  
				when().
				        get(url).
				then().
				        contentType("application/json").
				        statusCode(200).
				extract().
				        response(); 

	        
		return response.body().as(Integer.class);
		
	}
	
	

}
