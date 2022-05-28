package org.serratec.backend.ProjetoBorracharia.repository;

import org.serratec.backend.ProjetoBorracharia.model.ClienteBorracharia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteBorrachariaRepository extends JpaRepository<ClienteBorracharia, Integer> {

}
