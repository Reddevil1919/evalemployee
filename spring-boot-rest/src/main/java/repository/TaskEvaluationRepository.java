package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Employee;
import model.TaskEvaluation;

@Repository
public interface TaskEvaluationRepository extends JpaRepository<TaskEvaluation, Long> {

	public List<TaskEvaluation> findByEmployee(Employee employee);
	
}
