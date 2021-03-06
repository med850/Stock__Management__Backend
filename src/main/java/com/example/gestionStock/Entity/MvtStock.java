package com.example.gestionStock.Entity;

import java.math.BigDecimal;
import java.time.Instant;

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
@Table(name="mvtStock")

public class MvtStock extends AbstractEntity {

	
	@Column(name ="datemvt")
	private Instant dateMvt;
	
	
	@Column(name ="quantite")
	private BigDecimal quantite;
	
	
	
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;
	
	
	@Column(name="idEntreprise")
	private Integer idEntreprise;
	
	
	@Column(name = "typemvt")
	private TypeMvtStock typeMvt;
}
