package org.thes.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.thes.entities.LigneCommande;
import org.thes.entities.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Commande {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_commande;
	private Date date;
	private double montant;
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy="commande")
	private List<LigneCommande> ligneCommande;

}