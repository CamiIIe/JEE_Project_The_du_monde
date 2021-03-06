package org.thes.entities;

import java.io.Serializable;

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
public class UtilisateurRole {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_UtilisateurRole;

	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role role;

	
}