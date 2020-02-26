package five.com.project.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import five.com.project.spring.service.ImissionService;

@Controller
public class MissionController {
    @Autowired
    private ImissionService MissionService;
    @GetMapping("/mission")

	public ResponseEntity<?> getMission() {
    	return new ResponseEntity<>(MissionService.findAll(),HttpStatus.OK);
		
	}

}
