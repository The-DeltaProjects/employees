package za.ac.cput.factory;

import za.ac.cput.domain.Employees;

public class EmployeesFactory {
    public static Employees buildEmployee(Long id, String firstName, String lastName, String email, String position) {
        if (id == null || firstName == null || lastName == null || email == null || position == null) {
            return null;
        }

        return new Employees.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPosition(position)
                .build();
    }
}
