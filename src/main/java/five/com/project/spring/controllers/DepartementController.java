package five.com.project.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import five.com.project.spring.service.IdepartementService;

@Controller
public class DepartementController {
	@Autowired
	private IdepartementService DepartementService;
	@GetMapping("/departement")

	public ResponseEntity<?> getDepartement() {
		return new ResponseEntity<>(DepartementService.findAll(),HttpStatus.OK);
		
	}

}
