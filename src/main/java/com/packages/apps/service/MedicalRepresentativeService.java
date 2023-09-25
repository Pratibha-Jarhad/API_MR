package com.packages.apps.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packages.apps.entities.MedicalRepresentative;
import com.packages.apps.repository.CreateMedicalRepresentative;

@Service
public class MedicalRepresentativeService{

	@Autowired
	CreateMedicalRepresentative cmrrepo;
	
	public MedicalRepresentative saveRepresentative(MedicalRepresentative mr) {
		
		return cmrrepo.save(mr);
	}
	
	public List<MedicalRepresentative> getAllMedicalRepresentatives()
	{
		return cmrrepo.findAll();
	}
	

	public MedicalRepresentative getMRById(int mrID) 
	{
		Optional<MedicalRepresentative> mr=cmrrepo.findById(mrID);
		return mr.get();
	}
	
	public MedicalRepresentative updateMR(MedicalRepresentative mr, int mrID)
	{
		MedicalRepresentative existingmr=cmrrepo.findById(mrID).orElse(null);
		
		existingmr.setFirstName(mr.getFirstName());
		existingmr.setLastName(mr.getLastName());
		existingmr.setMrcontact(mr.getMrcontact());
		existingmr.setMremail(mr.getMremail());
		
		cmrrepo.save(existingmr);
		
		return existingmr;
	}
	
	public void deleteMR(int mrID)
	{
		cmrrepo.deleteById(mrID);
	}
}
