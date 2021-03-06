package com.example.gestionStock.Services;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.example.gestionStock.Dto.FournisseurDto;



public interface FournisseurServiceInterface {

	
	FournisseurDto save(FournisseurDto fournisseurDto);
	
	
	FournisseurDto findById(Integer id);
	
	
	List<FournisseurDto>findAll();
	
	
	void delete(Integer id);
	
	
	
}
