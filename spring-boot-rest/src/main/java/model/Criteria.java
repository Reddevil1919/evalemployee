package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter @Setter @NoArgsConstructor
public class Criteria {

	@Id private String label;
	private Integer rating;
	private Integer coefficient;
	
}
