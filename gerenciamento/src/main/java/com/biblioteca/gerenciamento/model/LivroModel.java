package com.biblioteca.gerenciamento.model;
import java.util.List;

import com.biblioteca.gerenciamento.Enum.StatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class LivroModel {

    @Id
    private long insbn;
    private List<String> nomeAutor;
    private String titulo;
    private int qntPages;
    private String tema;
    private int anoPub;
    private String editora;
    private int qntCopias;
    private StatusEnum status;


    public long getInsbn() {
        return insbn;
    }
    public void setInsbn(long insbn) {
        this.insbn = insbn;
    }
    public List<String> getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(List<String> nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getQntPages() {
        return qntPages;
    }
    public void setQntPages(int qntPages) {
        this.qntPages = qntPages;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public int getAnoPub() {
        return anoPub;
    }
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getQntCopias() {
        return qntCopias;
    }
    public void setQntCopias(int qntCopias) {
        this.qntCopias = qntCopias;
    }
    public StatusEnum getStatus() {
        return status;
    }
    public void setStatus(StatusEnum status) {
        this.status = status;
    }


}
