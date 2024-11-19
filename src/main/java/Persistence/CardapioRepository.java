package Persistence;

import Persistence.Entity.CardapioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<CardapioEntity, Long> {

}
