package org.thes;

import org.thes.dao.UtilisateurRepository;
import org.thes.dao.UtilisateurRoleRepository;
import org.thes.dao.ArticleRepository;
import org.thes.dao.RoleRepository;
import org.thes.entities.Utilisateur;
import org.thes.entities.UtilisateurRole;
import org.thes.entities.Role;
import org.thes.entities.Article;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ThesDuMonde implements CommandLineRunner {

	//@Autoware remplace le constructeur
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private ArticleRepository articleRepository;

	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private UtilisateurRepository utilisateurRepository;

	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private UtilisateurRoleRepository utilisateurRoleRepository;

	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(ThesDuMonde.class, args);
		/*
		new SpringApplicationBuilder(ThesDuMonde.class)
		.properties(singletonMan("server.port",8081))
		.registerShutdownHook(true)
		.run(args); */
	}

	@Override
	public void run(String... args) throws Exception {
		articleRepository.save(new Article(null,"GRAND YUNNAN IMPÉRIAL",8.70,"https://zupimages.net/up/20/16/a8m6.jpg",null));
		articleRepository.save(new Article(null,"PU ERH SAUVAGE DU MONT PHOENIX",28.00,"https://zupimages.net/up/20/16/tw7p.jpg",null));
		articleRepository.save(new Article(null,"THÉ DU HAMMAM",8.90,"https://zupimages.net/up/20/16/r646.jpg", null));
		articleRepository.save(new Article(null,"LONG JING",11.40,"https://zupimages.net/up/20/16/y1d5.jpg", null));
		articleRepository.save(new Article(null,"THÉ DU TIGRE",9.50,"https://zupimages.net/up/20/16/bzpm.jpg", null));
		articleRepository.save(new Article(null,"BLUE OF LONDON",8.70,"https://zupimages.net/up/20/16/e1j2.jpg", null));
		articleRepository.save(new Article(null,"PU ERH IMPÉRIAL",9.90,"https://zupimages.net/up/20/16/z2g7.jpg", null));
		articleRepository.save(new Article(null,"EARL GREY BIO",8.90,"https://zupimages.net/up/20/16/w74a.jpg", null));
		articleRepository.save(new Article(null,"DARJEELING MARGARET'S HOPE",9.50,"https://zupimages.net/up/20/16/dm8y.jpg", null));
		articleRepository.save(new Article(null,"FLEUR DE GEISHA",8.50,"https://zupimages.net/up/20/16/63jh.jpg", null));
		articleRepository.save(new Article(null,"SI JI CHUN DE LA FAMILLE WANG",42.00,"https://zupimages.net/up/20/16/qjnm.jpg", null));
		articleRepository.save(new Article(null,"KOTAGIRI FROST",25.00,"https://zupimages.net/up/20/16/9u0v.jpg", null));
		articleRepository.save(new Article(null,"GURANSE GREEN EMERALD",18.00,"https://zupimages.net/.jpg", null));
		
		//Utilisateur
		utilisateurRepository.save(new Utilisateur(null,"Camille","1234","Camille","Roumier","Tours",".com","06000000", null, null));
		utilisateurRepository.save(new Utilisateur(null,"Raphaël","1234","Raphaël","Mossion","Tours",".com","06000000", null, null));
		utilisateurRepository.save(new Utilisateur(null,"Elise","1234","Elise","Cornet","Tours",".com","06000000", null, null));
		utilisateurRepository.save(new Utilisateur(null,"Admin","1234","Admin","Admin","Tours",".com","06000000", null, null));

		//Role
		roleRepository.save(new Role(null,"ADMIN", null));
		roleRepository.save(new Role(null,"USER", null));

		
	}
	
}
