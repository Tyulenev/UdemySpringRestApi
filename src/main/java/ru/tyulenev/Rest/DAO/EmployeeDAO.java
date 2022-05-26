package ru.tyulenev.Rest.DAO;



import ru.tyulenev.Rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    public Employee getEmployee(int id);

    public void deleteEmp(int id);
}
