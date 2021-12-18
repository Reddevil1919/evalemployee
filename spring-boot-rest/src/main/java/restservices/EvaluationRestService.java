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
import org.springframework.web.bind.annotation.RestController;

import model.Evaluation;
import repository.EvaluationRepository;

@RestController
@ComponentScan("repository")
@Service
public class EvaluationRestService {

	@Autowired
	EvaluationRepository evaluationRepository;
	
	@PostMapping("/evaluation/create")
	public ResponseEntity<Evaluation> createEvaluation(@RequestBody Evaluation evaluation)
	{
		try {
			Evaluation createdEvaluation = evaluationRepository.save(evaluation);
			return new ResponseEntity<Evaluation>(createdEvaluation,HttpStatus.CREATED);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/evaluations")
	public ResponseEntity<List<Evaluation>> getAllEvaluations(){
		
		try {
			
			return new ResponseEntity<>(evaluationRepository.findAll(),HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
