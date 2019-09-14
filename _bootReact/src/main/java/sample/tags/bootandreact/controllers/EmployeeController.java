package sample.tags.bootandreact.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sample.tags.bootandreact.domain.Employee;
import sample.tags.bootandreact.repo.EmployeeRepo;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmployeeController {

   @Resource
   @Qualifier("empRepo")
   EmployeeRepo employeeRepo;

   @RequestMapping(method = RequestMethod.GET, value = "/emp", produces = "application/json")
   public List<Employee> getEmployeeList() {
      return employeeRepo.getAllEmployees();
   }
}
