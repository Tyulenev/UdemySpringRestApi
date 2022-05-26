package ru.tyulenev.Rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.tyulenev.Rest.Service.EmployeeService;
import ru.tyulenev.Rest.entity.Employee;
import ru.tyulenev.Rest.exceptionHandling.EmployeeIncorrectData;
import ru.tyulenev.Rest.exceptionHandling.NoSuchEmpException;

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

        if (emp==null) {
            throw new NoSuchEmpException("Нет работника с номером " + id + " в БД.");
        }

        return emp;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee emp) {
        employeeService.saveEmployee(emp);
        return emp;
    }


}
