package org.thes.web;

import java.util.ArrayList;
import java.util.List;

import org.thes.dao.ArticleRepository;
import org.thes.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {

	List<Article> pageArticlesPanier = new ArrayList<>();
	private double prixTotal = 0;

	@Autowired
	private ArticleRepository articleRepository;

	@GetMapping(path="/articles")
	public String articles(Model model, 
			@RequestParam(name="page", defaultValue = "0")int page,
			@RequestParam(name="size", defaultValue="6") int size,
			@RequestParam(name="motCle", defaultValue="") String motCle
			) {

		Page<Article> pageArticles=articleRepository
				.findByDesignationContains(motCle,PageRequest.of(page, size));
		model.addAttribute("pageArticles", pageArticles);
		model.addAttribute("currentPage", page);
		model.addAttribute("size", size);
		model.addAttribute("motCle", motCle);
		model.addAttribute("pages", new int[pageArticles.getTotalPages()]);
		return "articles";
	}

	//Méthode panier
	@GetMapping(path="/AjoutPanier")
	public String panier(Model model,Long idArticle){

		if (idArticle != null) { 

			Article pageArticlesPanierLoc= articleRepository.getOne(idArticle);
			pageArticlesPanier.add(pageArticlesPanierLoc);

			prixTotal = prixTotal + pageArticlesPanierLoc.getPrix();

			model.addAttribute("pageArticlesPanier", pageArticlesPanier);
			model.addAttribute("prixTotal", prixTotal);

			return "panier";
		}

		else { 
			model.addAttribute("pageArticlesPanier", pageArticlesPanier);
			model.addAttribute("prixTotal", prixTotal);
			return "panier"; }

	}

	@GetMapping(path="/deleteArticlePanier")
	public String deletePanier(Model model, Long id) {
		for(int i=0 ; i < pageArticlesPanier.size();i++) { 
			if (id == pageArticlesPanier.get(i).getId()) { 
				prixTotal = prixTotal - pageArticlesPanier.get(i).getPrix();
				pageArticlesPanier.remove(i);
			}	  
		}
		model.addAttribute("pageArticlesPanier", pageArticlesPanier);
		model.addAttribute("prixTotal", prixTotal);

		return "panier";
	}

	@RequestMapping(value="/")
	public String home() {
		return "redirect:/articles";
	}

	@GetMapping(path="/login") 
	public String login(Model model){
		return "login";
	} 

	@GetMapping(path="/deleteArticle")
	public String delete(Long id, String motCle, String page, String size ) {
		articleRepository.deleteById(id);
		return "redirect:/articles?page="+page+"&motCle="+motCle+"&size="+size;
	}

	@GetMapping(path="/payment")
	public String payment (Model model){
		model.addAttribute("prixTotal", prixTotal);
		return "payment";
	}

}
