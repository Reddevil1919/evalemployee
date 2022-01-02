package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.TaskEvaluation;

@Repository
public interface EvaluationRepository extends JpaRepository<TaskEvaluation, Long> {

}
