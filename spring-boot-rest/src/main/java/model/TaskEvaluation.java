package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@SequenceGenerator(name = "TEVAL_SEQ",sequenceName = "TEVAL_SEQ")
@Getter @Setter @NoArgsConstructor
public class TaskEvaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TEVAL_SEQ")
	private Long id;
	
	@OneToOne(targetEntity = Employee.class)
	public Employee employee;
	
	@OneToOne(targetEntity = Task.class)
	public Task task;
	
	public Integer quality;
	public Integer productivity;
	
	@Transient
	public Integer performance;
	
	public Integer commTiming;
	public Integer commAccuracy;
	
	@Transient
	public Integer communication;
	
	public Integer processRespect;
	
	public Integer getPerformance()
	{
		return (quality+productivity)/2;
	}
	
	public Integer getCommunication()
	{
		return (commAccuracy+commTiming)/2;
	}
}
