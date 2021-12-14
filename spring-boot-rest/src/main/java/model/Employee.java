package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@SequenceGenerator(name = "EMP_SEQ",sequenceName = "EMP_SEQ")
@Getter @Setter @NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "EMP_SEQ")
	Long id;
	public String name;
	public String lastName;
	public Integer experienceYears;
	

	
}
