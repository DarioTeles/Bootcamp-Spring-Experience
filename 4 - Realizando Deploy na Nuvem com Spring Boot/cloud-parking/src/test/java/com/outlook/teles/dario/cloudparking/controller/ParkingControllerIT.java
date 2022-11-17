package com.outlook.teles.dario.cloudparking.controller;

import com.outlook.teles.dario.cloudparking.controller.dto.ParkingCreateDTO;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ParkingControllerIT extends AbstractContainerBase{ //Ajuste do banco de dados para testes
class ParkingControllerIT {
    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUptest(){
        RestAssured.port = randomPort;
    }

//    @Test
//    void whenFindAllThenCheckResult() {
//        RestAssured.given()
//                .auth().basic("user", "12345")
//                .when()
//                .get("/parking")
//                .then()
//                .statusCode(HttpStatus.OK.value());
//    }
//
//    @Test
//    void whenCreateThenCheckIsCreated() {
//        var createDTO = new ParkingCreateDTO();
//        createDTO.setColor("AMARELO");
//        createDTO.setLicense("WRT-5555");
//        createDTO.setModel("BRASILIA");
//        createDTO.setState("SP");
//
//        RestAssured.given()
//                .when()
//                .auth().basic("user", "12345")
//                .contentType(MediaType.APPLICATION_JSON_VALUE)
//                .body(createDTO)
//                .post("/parking")
//                .then()
//                .statusCode(HttpStatus.CREATED.value())
//                .body("license", Matchers.equalTo("WRT-5555"))
//                .body("color", Matchers.equalTo("AMARELO"));
//    }
}