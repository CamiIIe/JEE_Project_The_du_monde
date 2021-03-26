package org.thes.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.thes.entities.Article;

public interface FavorisRepository extends JpaRepository<Article, Long> {

	/*public Page<Article> findByLibelleContains(String mc, Pageable pageable);
	
	@Query ("select a from Article a where a.libelle like :x and a.prixUnitaire>:y")
	public Page<Article> chercher(
			@Param("x")String mc,
			@Param("y")double prixMin, Pageable pageable);*/
}
