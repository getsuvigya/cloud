package employeeService.controllers;

import employeeService.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EmployeeController {
    @Value("${application.message}")
    private String configServerMessage;
    @Autowired
    private Environment environment;
    @RequestMapping(value="/employee/{x}" , method= RequestMethod.GET)
    public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("x")Integer roll){
        Employee employee = new Employee();
        if(roll.equals(1)){
            employee.setName("Ravi");
            employee.setRoll(1);
            employee.setConfigMessage(configServerMessage);
        }
        if(roll.equals(2)){
            employee.setName("Suvi");
            employee.setRoll(2);
            employee.setConfigMessage(configServerMessage);
        }
        employee.setServicePort(environment.getProperty("local.server.port"));
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

}