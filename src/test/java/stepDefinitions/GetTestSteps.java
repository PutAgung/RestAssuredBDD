package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.CoreMatchers.instanceOf;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetTestSteps {
    @Given("I perform GET operation from post")
    public void i_perform_GET_operation_from_post () {
       given().contentType(ContentType.JSON)
               .headers(
                       "Authorization",
                       "Bearer ",
                       "Content-Type",
                       ContentType.JSON,
                       "Accept",
                       ContentType.JSON);

    }

    @When("I perform GET for the post")
    public void i_perform_GET_for_the_post (){

    Response response = (Response) when()
                .get("https://api.staging.qoalaplus.com/quotation/v2/q/commercials/detail?code=CL-MC220413-9F3Y45ST")
            .then()
                .statusCode(400);


//        JsonPath Jname = response.jsonPath();
//        System.out.println(java.util.Optional.ofNullable((Jname.get("userId[20]").getClass().getSimpleName())));
//        assertTrue()
    }

    @Then("I should see the each parameter has correct datatype value")
    public void i_should_see_the_each_parameter_has_correct_datatype_value (){

    }

}
