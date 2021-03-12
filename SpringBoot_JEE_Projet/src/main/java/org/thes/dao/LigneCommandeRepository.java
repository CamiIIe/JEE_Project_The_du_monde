package org.thes.dao;

import org.thes.entities.Ligne_Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeRepository extends JpaRepository<Ligne_Commande, Long>{

}
