package com.projeto.backup.codigo.emprestimo;

public class Livro {
    private Integer id;
    private String nome;
    private Integer anoPublicacao;
    private String autor;
    private String editora;

    public Livro() {
    }

    public Livro(String nome, Integer anoPublicacao, String autor, String editora) {
        this.id = -1;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
    }

    public Livro(Integer id, String nome, Integer anoPublicacao, String autor, String editora) {
        this.id = id;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.editora = editora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}