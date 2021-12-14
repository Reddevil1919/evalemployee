package restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Task;
import repository.TaskRepository;

@RestController
@ComponentScan(basePackages = "repository")
@Service
public class TaskRestService {

	@Autowired
	TaskRepository taskRepository;
	
	@PostMapping("/task/create")
	public ResponseEntity<Task> createTask(@RequestBody Task task)
	{
		try {
			
			
			Task createdTask = taskRepository.save(task);
			System.out.println("Task successfully created!");
			return new ResponseEntity<Task>(createdTask,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/tasks")
	public ResponseEntity<List<Task>> getAllTasks(){
		
		try {
			return new ResponseEntity<>(taskRepository.findAll(),HttpStatus.OK);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
}
