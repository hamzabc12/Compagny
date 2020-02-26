package five.com.project.spring.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import five.com.project.spring.entities.employe;
import five.com.project.spring.service.IemployeService;
import five.com.project.spring.exception.NotFoundException;


@Controller
public class EmployeController {
	@Autowired
	 private IemployeService employeService;
	
	@GetMapping("/employe")
	public ResponseEntity<?> getEmploye(){
		return new ResponseEntity<>(employeService.getEmploye(),HttpStatus.OK);
	}
@PostMapping("/addEmploye")
public @ResponseBody ResponseEntity<?> addEmploye(@RequestBody employe employe){
		
		employeService.addEmpl(employe);
		return new ResponseEntity<>("employe ajoute",HttpStatus.CREATED);
		
			
}

@PostMapping("employe/update/{employeId}")
public @ResponseBody ResponseEntity<?>updateEmploye(@PathVariable (value ="employeId")
                                           int id,@RequestBody employe employe){
		try {
			employeService.updateEmploye(id, employe);
			return new ResponseEntity<>("Employe is updated",HttpStatus.OK);}
		
		catch (Exception e) {
			throw new  NotFoundException(id, "Employe");
		}
			
			

} 
@GetMapping("employe/delete/{employeId}")
public @ResponseBody ResponseEntity<?>deleteEmploye(@PathVariable (value = "employeId") int id){
	employeService.deleteEmploye(id);
	return new ResponseEntity<>("employe is deleted",HttpStatus.OK);
}


}

