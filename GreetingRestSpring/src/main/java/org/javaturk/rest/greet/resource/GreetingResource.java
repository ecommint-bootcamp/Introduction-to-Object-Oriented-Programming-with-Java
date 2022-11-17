package org.javaturk.rest.greet.resource;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.javaturk.rest.greet.domain.Greeting;
import org.javaturk.rest.greet.repo.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value="/greetings", produces="application/json")
public class GreetingResource {

	@Autowired
	private GreetingRepository repo;
	
	@GetMapping
	public Map<String, String> getAllGreetings() {
		return repo.getGreetingMap();
	}

	
	@GetMapping(value = "objects/1", produces="application/json")
	public List<Greeting> getAllGreetingObjectsAsJSON1() {
		System.out.println("in getAllGreetingObjectsAsJSON1()");
		return repo.getGreetingList();
	}
	
	@GetMapping(value = "objects/2", produces="application/json")
	public ResponseEntity<List<Greeting>> getAllGreetingObjectsAsJSON2() {
		System.out.println("in getAllGreetingObjectsAsJSON2()");
		return ResponseEntity.ok(repo.getGreetingList());
	}
	
	@GetMapping(value = "objects/3", produces="application/json")
	public ResponseEntity<List<Greeting>> getAllGreetingObjectsAsJSON3() {
		System.out.println("in getAllGreetingObjectsAsJSON3()");
		List<Greeting> list = repo.getGreetingList();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	
	@GetMapping(value = "objects", produces="application/xml")
	public List<Greeting> getAllGreetingObjectsAsXML() {
		System.out.println("in getAllGreetingObjectsAsXML()");
		return repo.getGreetingList();
	}

	@GetMapping("languages")
	public ResponseEntity<Set<String>> getAllLanguages() {
		return ResponseEntity.ok(repo.getAllLanguages());
	}

	@GetMapping(value = "count/1")
	public ResponseEntity<String> getGreetingCount1() {
		Integer size = repo.getSize();
		return ResponseEntity.ok().body(size.toString());
	}
	
	@GetMapping(value = "count/2")
	public String getGreetingCount2() {
		Integer size = repo.getSize();
		return size.toString();
	}

	@GetMapping(value = "{language}/1")
	public ResponseEntity<String> getGreeting1(@PathVariable("language") String language) {
		String greeting = repo.getGreeting(language);
		if (greeting != null)
			return ResponseEntity.ok(greeting );
		else
			return ResponseEntity.status(404).build();
	}
	
	@GetMapping(value = "{language}/2")
	public String getGreeting2(@PathVariable("language") String language) {
		String greeting = repo.getGreeting(language);
		if (greeting != null)
			return greeting;
		else
			return "No such language found: " + language;
	}
	
	@PostMapping("{language}/{greeting}")
	public ResponseEntity<Object> createGreetingByParameter(@PathVariable("language") String language, @PathVariable("greeting") String greeting) {
		Greeting greetingObject = new Greeting(language, greeting);
		if (repo.addGreeting(greetingObject)) {
			URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("").buildAndExpand().toUri(); 
			return ResponseEntity.created(location).build();
		} else
			return ResponseEntity.status(409).build();
	}
	
	@PutMapping("{language}/{greeting}")
	public ResponseEntity<Object> replaceGreetingByParameter(@PathVariable("language") String language, @PathVariable("greeting") String greeting) {
		Greeting greetingObject = new Greeting(language, greeting);
		if (repo.contains(language)) {
			if (repo.contains(greetingObject)) {
				return ResponseEntity.status(409).body("Exact reasource already exists!");
			} else {
				if (repo.replaceGreeting(greetingObject)) {
					return ResponseEntity.ok().build();
				} else
					return ResponseEntity.status(409).body("A problem occurred during replacement!");
			}
		} else{
			repo.addGreeting(greetingObject);
			return ResponseEntity.status(200).body(greetingObject);
		}
	}
	
	@PutMapping(value="{language}")
	public ResponseEntity<Object> replaceGreetingByEntity(@PathVariable("language") String language,@RequestBody Greeting greeting) {
		if (repo.contains(language)) {
			if (repo.contains(greeting)) {
				return ResponseEntity.status(409).body("Exact resource already exists!");
			} else {
				if (repo.updateGreeting(greeting,language)) {
					return ResponseEntity.ok().build();
				} else
					return ResponseEntity.status(409).body("A problem occurred during replacement!");
			}
		} else {
			repo.addGreeting(greeting);
			return ResponseEntity.status(200).body(greeting);
		}
	}
	
	@DeleteMapping("{language}")
	public ResponseEntity<Object> deleteGreeting(@PathVariable("language") String language) {
		if (repo.deleteGreeting(language))
			return ResponseEntity.status(200).body("Resource with language " + language + " has been deleted.");
		else
			return ResponseEntity.status(409).body("No such language found: " + language);
	}
}
