package org.thes.dao;

import org.thes.entities.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article, Long>{
	
	public Page<Article> findByDesignationContains(String mc, Pageable pageable);

}
