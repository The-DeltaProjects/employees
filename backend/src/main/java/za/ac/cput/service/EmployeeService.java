package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Repository.IEmployeeRepo;
import za.ac.cput.domain.Employees;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    public IEmployeeRepo repo;

    @Override
    public Employees create(Employees employees) {
        return repo.save(employees);
    }

    @Override
    public Employees read(Long aLong) {
        return repo.findById(aLong).orElse(null);
    }

    @Override
    public Employees update(Employees employees) {
        return repo.save(employees);
    }

    @Override
    public boolean delete(Long aLong) {
        return false;
    }

    @Override
    public List<Employees> getAll() {
        return repo.findAll();
    }
}
