package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.TaskEvaluation;

@Repository
public interface TaskEvaluationRepository extends JpaRepository<TaskEvaluation, Long> {

}
