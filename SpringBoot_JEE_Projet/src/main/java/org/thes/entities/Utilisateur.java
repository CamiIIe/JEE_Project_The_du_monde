package org.thes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.thes.entities.Commande;
import org.thes.entities.UtilisateurRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Utilisateur {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_utilisateur;
	private String pseudo;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String tel;
	
	@OneToMany(mappedBy= "utilisateur")
	private List<Commande> commande;
	
	@OneToMany(mappedBy="utilisateur")
	private List<UtilisateurRole> utilisateurRole;
}