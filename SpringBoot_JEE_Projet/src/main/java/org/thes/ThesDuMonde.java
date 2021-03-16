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
	}

	@Override
	public void run(String... args) throws Exception {
		articleRepository.save(new Article(null,"GRAND YUNNAN IMPÉRIAL","Thé noir de Chine",8.70,"https://zupimages.net/up/21/11/aogl.jpg",null));
		articleRepository.save(new Article(null,"PU ERH DU MONT PHOENIX","Thé sombre de Yunnan, Chine",28.00,"https://zupimages.net/up/21/11/6vum.jpg",null));
		articleRepository.save(new Article(null,"THÉ DU HAMMAM","Thé vert parfumé - Fruité & Floral",8.90,"https://zupimages.net/up/21/11/vkho.jpg", null));
		articleRepository.save(new Article(null,"LONG JING","Thé vert de Zhejiang, Chine",11.40,"https://zupimages.net/up/21/11/s6i3.jpg", null));
		articleRepository.save(new Article(null,"THÉ DU TIGRE","Thé noir de Taïwan - Fumé",9.50,"https://zupimages.net/up/21/11/csbb.jpg", null));
		articleRepository.save(new Article(null,"BLUE OF LONDON","Thé noir parfumé - Agrumes",8.70,"https://zupimages.net/up/21/11/wl4r.jpg", null));
		articleRepository.save(new Article(null,"PU ERH IMPÉRIAL","Thé sombre de Yunnan, Chine",9.90,"https://zupimages.net/up/21/11/vmiz.jpg", null));
		articleRepository.save(new Article(null,"EARL GREY BIO","Thé noir parfumé - Agrumes",8.90,"https://zupimages.net/up/21/11/89kc.jpg", null));
		articleRepository.save(new Article(null,"DARJEELING MARGARET'S HOPE","Thé noir d'Inde",9.50,"https://zupimages.net/up/21/11/1avh.jpg", null));
		articleRepository.save(new Article(null,"FLEUR DE GEISHA","Thé vert parfumé - Floral & Fruité",8.50,"https://zupimages.net/up/21/11/7dh6.jpg", null));
		articleRepository.save(new Article(null,"SI JI CHUN DE LA FAMILLE WANG","Oolong de Nantou, Taïwan",42.00,"https://zupimages.net/up/21/11/jz5t.jpg", null));
		articleRepository.save(new Article(null,"KOTAGIRI FROST","Thé noir de Nilgiri, Inde",25.00,"https://zupimages.net/up/21/11/a9df.jpg", null));
		articleRepository.save(new Article(null,"GURANSE GREEN EMERALD","Thé vert du Népal",18.00,"https://zupimages.net/up/21/11/r99h.jpg", null));
		articleRepository.save(new Article(null,"GENMAICHA MIDORI","Thé vert du Japon",13.00,"https://zupimages.net/up/21/11/xhex.jpg", null));
		articleRepository.save(new Article(null,"MATE VERDE CHIMARRÃO","Maté vert du Brésil",5.90,"https://zupimages.net/up/21/11/1kfl.jpg", null));
		articleRepository.save(new Article(null,"GURANSE GREEN EMERALD","Thé noir parfumé - Épicé",8.70,"https://zupimages.net/up/21/11/lc2i.jpg", null));
		
		
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
