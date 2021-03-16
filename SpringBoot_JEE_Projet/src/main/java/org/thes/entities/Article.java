package org.thes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // This tells Hibernate to make a table out of this class

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Article {
		
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_article;
	private String libelle;
	private String description;
	private double prixUnitaire;
	private String image;
	
	@OneToMany(mappedBy = "article", fetch = FetchType.EAGER)
	private List<LigneCommande> commandeAssocie;
		
}