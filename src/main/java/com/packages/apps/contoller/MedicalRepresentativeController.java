
package com.packages.apps.contoller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.packages.apps.entities.MedicalRepresentative;
import com.packages.apps.service.MedicalRepresentativeService;



@RestController
//@RequestMapping("http://localhost:8080")
public class MedicalRepresentativeController {
	
	@Autowired
	MedicalRepresentativeService mrservice;
	
	//insert MR Rest API
	@PostMapping("/createmr")
	public MedicalRepresentative saveRepresentative(@RequestBody MedicalRepresentative mr)
	{
		
		mr=mrservice.saveRepresentative(mr);
		return mr;
	}

	//build get all MR Rest API
	@GetMapping("/getallmrs")
	public List<MedicalRepresentative> getAllMedicalRepresentatives()
	{
		return mrservice.getAllMedicalRepresentatives();
	}
	
	//get MR by ID
	@GetMapping("/getallmrbyid")
	public MedicalRepresentative getMRById(@RequestParam int mrID)
	{
		return mrservice.getMRById(mrID);
	}
	
	//update MR
	@PutMapping("/updatemr")
	public MedicalRepresentative updateMR(@RequestParam int mrID,@RequestBody MedicalRepresentative mr)
	{
		return mrservice.updateMR(mr, mrID);
	}
	
	//delete MR
	@DeleteMapping("/deletemr")
	public void deleteMR(@RequestParam int mrID)
	{
		mrservice.deleteMR(mrID);
	}
}
