package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Employees;
import za.ac.cput.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employees createEmployee(@RequestBody Employees employee){
        return employeeService.create(employee);
    }

    @GetMapping("/read/{id}")
    public Employees readEmployee(@PathVariable Long id){
        return employeeService.read(id);
    }

    @PutMapping("/update")
    public Employees updateEmployee(@RequestBody Employees employee){
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable Long id){
        return employeeService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Employees> getAllEmployees() {
        return employeeService.getAll();
    }

}
