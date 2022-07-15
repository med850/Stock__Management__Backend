package com.example.gestionStock.Entity;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="commandeClient")
public class CommandeClient extends AbstractEntity {
	
	
	@Column(name="code")
	private String code;
	
	@Column(name="datecommande")
	private Instant dateCommande;
	
	
	@ManyToOne
	@JoinColumn(name="idclient")
	private Client client;
	
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneComClient> ligneCommandeClient;

}

