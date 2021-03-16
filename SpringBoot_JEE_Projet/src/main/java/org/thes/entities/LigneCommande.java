package org.thes.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class LigneCommande {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ligneCommande;
	private int quantite;
	private double prixLigne;
	
	@ManyToOne
	@JoinColumn(name="id_commande")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name="id_article")
	private Article article;



}

	

