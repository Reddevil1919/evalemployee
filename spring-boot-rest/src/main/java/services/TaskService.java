package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Task;
import repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	public Task createTask(Task task)
	{
		return taskRepository.save(task);
	}

	public List<Task> findAll() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

	public Task findById(long id) {
		// TODO Auto-generated method stub
		return taskRepository.findById(id).get();
	}
	
}
