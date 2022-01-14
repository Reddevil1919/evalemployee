package restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import repository.EmployeeRepository;
import services.EmployeeService;

@RestController
@ComponentScan("services")
@Service
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("employee/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
	{
		try {
			return new ResponseEntity<Employee>(employeeService.createEmployee(employee),HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		try {
			return new ResponseEntity<List<Employee>>(employeeService.findAll(),HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
