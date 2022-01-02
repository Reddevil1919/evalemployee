package model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@SequenceGenerator(name = "GEVAL_SEQ",sequenceName = "GEVAL_SEQ")
@Getter @Setter @NoArgsConstructor
public class EmployeeEvaluation {

}
