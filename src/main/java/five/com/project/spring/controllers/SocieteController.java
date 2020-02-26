package five.com.project.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import five.com.project.spring.entities.societe;
import five.com.project.spring.service.IsocieteService;

@RestController
public class SocieteController {
	
@Autowired
private IsocieteService SocieteService;
@GetMapping("/societe")
	public ResponseEntity<?> getSociete(){
	return new ResponseEntity<>(SocieteService.findAll(),HttpStatus.OK);
		
	}
@PostMapping("/societe")
public @ResponseBody ResponseEntity<?> addSociete(@RequestBody societe societe){
	SocieteService.addSociete(societe);
	return new ResponseEntity<>("Societe is added",HttpStatus.CREATED);
}
@PostMapping("societe/update/{societeId}") 
public  @ResponseBody ResponseEntity<?> updateSociete(@PathVariable (value = "societeId") int id,
                                                     @RequestBody societe societe)
{
	SocieteService.updateSociete(id,societe);
	return new ResponseEntity<>("societe is updated",HttpStatus.OK);
}
@PostMapping("societe/delete/{societeId}")
public @ResponseBody ResponseEntity<?> deleteSociete(@PathVariable (value = "societeId")int id){
	SocieteService.deleteSociete(id);
	return new ResponseEntity<>("societe is deleted",HttpStatus.OK);
}

}
