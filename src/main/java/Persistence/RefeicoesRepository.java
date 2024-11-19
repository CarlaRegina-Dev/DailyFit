package Persistence;

import Persistence.Entity.RefeicoesEntity;
import Persistence.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefeicoesRepository extends JpaRepository<RefeicoesEntity, Long> {
}
