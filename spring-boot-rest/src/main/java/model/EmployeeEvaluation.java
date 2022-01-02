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
@SequenceGenerator(name = "GEVAL_SEQ",sequenceName = "GEVAL_SEQ")
@Getter @Setter @NoArgsConstructor
public class EmployeeEvaluation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "GEVAL_SEQ")
	private Long id;
	
	@OneToOne(targetEntity = Employee.class)
	public Employee employee;
}
