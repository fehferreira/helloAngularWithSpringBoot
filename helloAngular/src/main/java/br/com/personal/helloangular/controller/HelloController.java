package br.com.personal.helloangular.controller;

import br.com.personal.helloangular.model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloController {

    private List<Employee> employees = createList();

    @RequestMapping(value = "/employees", produces = "application/json")
    @GetMapping
    public List<Employee> firstPage(){
        return this.employees;
    }

    private List<Employee> createList(){
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("emp1");
        emp1.setDesignation("manager");
        emp1.setEmpId("1");
        emp1.setSalary(3000);
        employees.add(emp1);

        Employee emp2 = new Employee();
        emp2.setName("emp2");
        emp2.setDesignation("developer");
        emp2.setEmpId("2");
        emp2.setSalary(3000);
        employees.add(emp2);

        return employees;
    }


}
