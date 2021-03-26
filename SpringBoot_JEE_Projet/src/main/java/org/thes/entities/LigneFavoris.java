package org.thes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class LigneFavoris {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_lignefavoris;

	@ManyToOne
	@JoinColumn(name="id_favoris")
	private Favoris favoris;
	
	@ManyToOne
	@JoinColumn(name="id_article")
	private Article article;

}
