package com.tarun.rest.PositionRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarun.rest.PositionRest.entities.Positions;
import com.tarun.rest.PositionRest.service.PositionService;



@RestController
public class PositionController {
	
	@Autowired
	private PositionService positionService;
    
	@GetMapping("/Home")
	public String Home() {
		return "Welcome tarun";
	}
	
	// Get list of all Position	
	@GetMapping("list")
	public List<Positions> GetPositions(){
		
	   return this.positionService.getPositions();
	}
	
	// only one position
    	@GetMapping("position/{positionid}")
	 public Positions  getPositions(@PathVariable String positionid) {
		 return this.positionService.getPosition(Long.parseLong(positionid));
	 }
	
	
	 // for add position
	 @PostMapping("/position")
	 public Positions addPositions(@RequestBody Positions positions) {
		 return this.positionService.addPosition(positions);
	 }
	 
	 // for update position 
	 @PutMapping("position/{positionid}")
	 public Positions updatePositions(@RequestBody Positions positions) {
		 return this.positionService.updatePosition(positions);
	 }
	 
	 
	 // for delete position
	 @DeleteMapping("position/{positionid}")
	 public ResponseEntity<HttpStatus> deleteposition(@PathVariable String positionid){
		 try {
			this.positionService.deletePostion(Long.parseLong(positionid));
			return new ResponseEntity<>(HttpStatus.OK);
		 } catch (Exception e) {
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 }
	
}
