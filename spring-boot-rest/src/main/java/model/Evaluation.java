package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter @Setter @NoArgsConstructor
public class Evaluation {

	@Id private Long id;
	
	@OneToOne(targetEntity = Employee.class)
	public Employee employee;
	
	@OneToOne(targetEntity = Task.class)
	public Task task;
	
	@OneToOne(targetEntity = Criteria.class)
	public Criteria quality = new Criteria();
	
	@OneToOne(targetEntity = Criteria.class)
	public Criteria productivity = new Criteria();
	
	public Integer getPerformance()
	{
		return (quality.getRating()+productivity.getRating())/2;
	}
	
}
