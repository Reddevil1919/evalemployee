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
@SequenceGenerator(name="TASK_SEQ",sequenceName = "TASK_SEQ")
@Getter @Setter @NoArgsConstructor
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TASK_SEQ")
	Long id;
	
	public String taskName;
	public String description;
	public Integer storyPoints;
	public String startDate;
	public String endDate;
	
	@OneToOne(targetEntity = Employee.class)
	public Employee developer;
	
	@OneToOne(targetEntity = Employee.class)
	public Employee supervisor;
	
	public Task(String taskName, String description, Integer storyPoints, String startDate, String endDate,
			Employee developer, Employee supervisor) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.storyPoints = storyPoints;
		this.startDate = startDate;
		this.endDate = endDate;
		this.developer = developer;
		this.supervisor = supervisor;
	}
	
	
	
}
