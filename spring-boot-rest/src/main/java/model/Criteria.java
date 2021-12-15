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
@SequenceGenerator(name = "CRI_SEQ",sequenceName = "CRI_SEQ")
@Getter @Setter @NoArgsConstructor
public class Criteria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CRI_SEQ")
	private String label;
	
	private Integer rating;
	
	
	private Integer coefficient;
	
}
