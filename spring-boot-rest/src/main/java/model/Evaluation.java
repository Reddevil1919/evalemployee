package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@SequenceGenerator(name = "EVAL_SEQ",sequenceName = "EVAL_SEQ")
@Getter @Setter @NoArgsConstructor
public class Evaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "EVAL_SEQ")
	private Long id;
	
	@OneToOne(targetEntity = Employee.class)
	public Employee employee;
	
	@OneToOne(targetEntity = Task.class)
	public Task task;
	
	@OneToOne(targetEntity = Criteria.class)
	public Criteria quality;
	
	@OneToOne(targetEntity = Criteria.class)
	public Criteria productivity;
	
	public Integer getPerformance()
	{
		return (quality.getRating()+productivity.getRating())/2;
	}
	
}
