package com.packages.apps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packages.apps.entities.MedicalRepresentative;

@Repository
public interface CreateMedicalRepresentative extends JpaRepository<MedicalRepresentative, Integer> {

	//MedicalRepresentative saveRepresentative(MedicalRepresentative mr);
}
