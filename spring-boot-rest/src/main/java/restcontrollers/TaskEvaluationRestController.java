package restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import model.TaskEvaluation;
import repository.TaskEvaluationRepository;

@RestController
@ComponentScan("repository")
@Service
public class TaskEvaluationRestController {

	@Autowired
	TaskEvaluationRepository taskEvaluationRepository;
	
	@PostMapping("/evaluation/create")
	public ResponseEntity<TaskEvaluation> createEvaluation(@RequestBody TaskEvaluation evaluation)
	{
		try {
			TaskEvaluation createdTaskEvaluation = taskEvaluationRepository.save(evaluation);
			return new ResponseEntity<TaskEvaluation>(createdTaskEvaluation,HttpStatus.CREATED);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/evaluations")
	public ResponseEntity<List<TaskEvaluation>> getAllTaskEvaluations(){
		
		try {
			
			return new ResponseEntity<>(taskEvaluationRepository.findAll(),HttpStatus.OK);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/evaluations/employee")
	public ResponseEntity<List<TaskEvaluation>> getTasksByEmployee(Employee employee)
	{
		try {
			
			return new ResponseEntity<>(taskEvaluationRepository.findByEmployee(employee),HttpStatus.OK);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
