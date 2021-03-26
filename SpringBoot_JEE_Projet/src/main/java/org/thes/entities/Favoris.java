package org.thes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Favoris {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_favoris;
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur; 
	
	@OneToMany(mappedBy = "favoris", fetch = FetchType.EAGER)
	private List<LigneFavoris> lignefavoris; 

}
