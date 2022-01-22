package com.kalakota.sb.restapi.controller;

import com.kalakota.sb.restapi.model.Employee;
import com.kalakota.sb.restapi.service.EmployeeService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/org")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> listEmployees (){
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "OK";
    }

    @GetMapping("/employees/{employeeId}")
    @ResponseBody
    public Employee getEmployee (@PathVariable Integer employeeId){
        return employeeService.getSpecificEmployee(employeeId);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String removeEmployee (@PathVariable Integer employeeId){
         employeeService.removeEmployee(employeeId);
        return "Employee removed successfully";
    }


}
