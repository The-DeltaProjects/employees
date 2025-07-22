package za.ac.cput.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Employees;
import za.ac.cput.factory.EmployeesFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    private TestRestTemplate restTemplate;
    private Employees employee1;
    private Employees employee2;

    String baseUrl = "http://localhost:8080/employee/Employee";

    @BeforeEach
    void setUp() {
        employee1 = EmployeesFactory.buildEmployee("Luyanda", "Makhanya", " luya@gmail.com", "Developer");
        employee2 = EmployeesFactory.buildEmployee("Nomusa", "Mathonsi", "sah@gmail.com", "Designer");

    }

    void createEmployee() {
        String url = baseUrl + "/create";
        ResponseEntity<Employees> postResponse = restTemplate.postForEntity(url, employee1, Employees.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());
    }
    @Test
    void readEmployee() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void deleteEmployee() {
    }

    @Test
    void getAllEmployees() {
    }
}