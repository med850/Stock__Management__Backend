package com.example.gestionStock.Services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.example.gestionStock.Dto.EntrepriseDto;



public interface EntrepriseServiceInterface {

	
	
	EntrepriseDto save(EntrepriseDto entrepriseDto);
	
	
	EntrepriseDto findById(Integer id);
	
	
	List<EntrepriseDto>findAll();
	
	
	void delete(Integer id);
	
	
	
}
