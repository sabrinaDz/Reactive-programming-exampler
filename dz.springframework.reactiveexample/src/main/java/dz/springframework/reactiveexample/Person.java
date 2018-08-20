package dz.springframework.reactiveexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	
	private String firstName;
	private String lastName;
	
	
	public String sayMyName(){
		return "myName is "+firstName+" "+lastName;
	}
}
