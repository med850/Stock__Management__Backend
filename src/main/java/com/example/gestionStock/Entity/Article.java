package com.example.gestionStock.Entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="article")
public class Article extends AbstractEntity {

	
	
	@Column(name="codearticle")
	private String codeArticle;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="prixunitaireht")
	private BigDecimal prixUNitaireHt;
	
	
	
	@Column(name="tva")
	private BigDecimal tva;
	

	@Column(name="prixunitaireltc")
	private BigDecimal prixUNitaireLtc;
	
	
	@Column(name="photo")
	private String photo;
	
	
	@Column(name="idEntreprise")
	private Integer idEntreprise;
	
	@ManyToOne
	@JoinColumn(name="idcategorie")
	private Categorie categorie;
	
	
	
}