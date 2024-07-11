package br.com.api.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.api.modelo.Pessoa;
import br.com.api.api.repositorio.PessoaRepositorio;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Controle {

    @Autowired
    private PessoaRepositorio funcao;

    @PostMapping("/tudo")
    public Pessoa salvar(@RequestBody Pessoa pessoinha) {
        return funcao.save(pessoinha);
    }
    
    @GetMapping("/tudo")
    public List<Pessoa> busca(){
        return funcao.findAll();
    }

    @GetMapping("/tudo/{id}")
    public Pessoa selecionaID (@PathVariable int id){
        return funcao.buscaId(id);
    }
    
    
    @GetMapping("")
    public String mensagem(){
        return "Olá Mundo!";
    }

    @GetMapping("/bemvindo")
    public String bemVindo() {
        return "Bem vindo ao Spring";
    }

    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem vindo(a) " +nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa (@RequestBody Pessoa p){
        return p;
    }
    
}
