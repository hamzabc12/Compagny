package five.com.project.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import five.com.project.spring.service.IcontratService;

@Controller
public class ContratController {
	@Autowired
	private IcontratService ContratService;
	@GetMapping("/contrat")

	public ResponseEntity<?> getContrat(){
		return new ResponseEntity<>(ContratService.findAll(),HttpStatus.OK);
		
	}

}
