package za.ac.cput.factory;

import za.ac.cput.domain.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeesFactoryTest {

    @Test
    void testBuildSuccess() {
        Employees employee = EmployeesFactory.buildEmployee( 123L, "John", "Doe", "john@gmail,com", "Developer");
        assertNotNull(employee);
        assertEquals(123L, employee.getId());
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("john@gmail,com", employee.getEmail());

    }
}