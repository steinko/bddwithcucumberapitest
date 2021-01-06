package bddwithcucumberapitest;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

public class WithdrawalServiceTest {
	
	@Test
	public void shouldStoreMessage() {
		
   	   String url =  "http://localhost:8080/withdraw/200";	
   	   
   	   given()
       .when()
          .put(url)
       .then()
         .statusCode(200); 
	}

}
