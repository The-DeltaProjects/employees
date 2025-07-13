package za.ac.cput.service;

import za.ac.cput.domain.Employees;

import java.util.List;

public interface IEmployeeService extends IService<Employees, Long> {
    List<Employees> getAll(); // Assuming you want to retrieve all employees

}
