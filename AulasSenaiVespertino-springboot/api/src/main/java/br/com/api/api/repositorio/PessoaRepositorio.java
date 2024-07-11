package br.com.api.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import br.com.api.api.modelo.Pessoa;


public interface PessoaRepositorio extends CrudRepository <Pessoa, Integer> {

    @SuppressWarnings("null")
    List<Pessoa> findAll();

    Pessoa buscaId(int id);
}
