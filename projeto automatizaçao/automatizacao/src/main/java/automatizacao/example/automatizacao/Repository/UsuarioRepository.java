package automatizacao.example.automatizacao.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import automatizacao.example.automatizacao.Model.UsuarioModel;


public interface UsuarioRepository  extends JpaRepository<UsuarioModel, Long>{

    Optional<UsuarioModel> findByEmail(String email);

}
