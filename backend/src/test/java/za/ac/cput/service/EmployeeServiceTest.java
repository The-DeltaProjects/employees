package za.ac.cput.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employees;
import za.ac.cput.factory.EmployeesFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceTest {

    @Autowired
    private IEmployeeService employeeService;
    private Employees employee1;
    private Employees employee2;
    private Long employee1Id;


    @BeforeEach
    void setUp() {
        employee1 = EmployeesFactory.buildEmployee("Luyanda", "Makhanya", "luyanda@gmail.com", "Developer");
        employee2 = EmployeesFactory.buildEmployee("Nomusa", "Mathonsi", "sah@gmail.com", "Designer");

        Employees createdEmployee1 = employeeService.create(employee1);
        Employees createdEmployee2 = employeeService.create(employee2);

        employee1Id = createdEmployee1.getId();
    }

    @Test
    void create() {

        assertNotNull(employee1Id);
    }

    @Test
    void read() {
        Employees readEmployee = employeeService.read(employee1Id);
        assertNotNull(readEmployee);

        Employees nonExistingEmployee = employeeService.read(999L);
        assertNull(nonExistingEmployee);

        System.out.println(readEmployee);
    }

    @Test
    void update() {
        Employees updatedEmployee = new Employees.Builder()
                .copy(employeeService.read(employee1Id)) // safer
                .setLastName("Mkhoma")
                .build();

        Employees updatedEmployee2 = employeeService.update(updatedEmployee);
        assertNotNull(updatedEmployee2);
        System.out.println(updatedEmployee2);
    }

    @Test
    void delete() {
        boolean deleted = employeeService.delete(employee1Id);
        assertFalse(deleted);
    }

    @Test
    void getAll() {
        assertNotNull(employeeService.getAll());
        assertFalse(employeeService.getAll().isEmpty());
        System.out.println("All employees: " + employeeService.getAll());
    }
}