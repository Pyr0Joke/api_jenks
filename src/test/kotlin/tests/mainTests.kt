package tests

import io.restassured.RestAssured
import io.restassured.http.ContentType
import net.serenitybdd.junit.runners.SerenityRunner
import org.junit.runner.RunWith
import org.junit.Test

@RunWith(SerenityRunner::class)
class mainTests {
    @Test
    fun autorization(){
        RestAssured.baseURI = "http://slbe-srv01:8080/api/v1"
        val jsonAsMap = HashMap<String, Any>()
        jsonAsMap.put("login", "lipatovav1")
        jsonAsMap.put("password", "Snapcaster2!1")
        RestAssured.given().contentType(ContentType.JSON).body(jsonAsMap).`when`().post("/auth/login")
                .then().assertThat().statusCode(200)
    }

}