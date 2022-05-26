package ru.tyulenev.Rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tyulenev.Rest.Service.EmployeeService;
import ru.tyulenev.Rest.entity.Employee;

import java.util.List;


@RestController //Управляет запросами и ответами - спец. контроллер
@RequestMapping("/api")
public class MyREESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmpl = employeeService.getAllEmployees();
        return allEmpl;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee emp = employeeService.getEmployee(id);
        return emp;
    }


}
