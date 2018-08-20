package dz.springframework.reactiveexample;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;

import reactor.core.publisher.Mono;



@Slf4j
public class ReactiveExampleTest {

	
	
	private Person sabPerson=new Person("sabrina","sahli");
	private Person yacine =new Person("yacine","koriche");
	private Person adam=new Person("adam","koriche");
	private Person daoud=new Person("daoud","sahli");
	
	
	@Test
	public void monoTest(){
		
		//create new person mono
		Mono<Person>mono=Mono.just(sabPerson);
		//get person object from mono publisher
		Person person=mono.block();
		log.info(person.sayMyName());
		
		
	
}
	
	
	
	
}
