package Persistence;

import Persistence.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaComprasRepository extends JpaRepository<ListaComprasRepository, Long> {
}
