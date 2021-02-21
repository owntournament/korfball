package org.owntournament.extension.korfball;

import org.owntournament.core.SomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeEndpoint {
	private SomeService _service;
	
	public SomeEndpoint(SomeService service) {
		_service = service;
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> GetTest() {
		return ResponseEntity.ok().body(_service.Test());
	}
	
}
