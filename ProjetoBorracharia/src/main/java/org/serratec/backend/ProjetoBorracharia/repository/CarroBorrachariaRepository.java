package org.serratec.backend.ProjetoBorracharia.repository;

import org.serratec.backend.ProjetoBorracharia.model.CarroBorracharia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroBorrachariaRepository extends JpaRepository<CarroBorracharia, Integer>{

}
