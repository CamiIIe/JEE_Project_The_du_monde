package org.thes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.thes.entities.LigneCommande;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Article {
		
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_article;
	private String libelle;
	private String description;
	private double prixUnitaire;
	private String image;
	
	@OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
	private List<LigneCommande> commandeAssocie;
		
}