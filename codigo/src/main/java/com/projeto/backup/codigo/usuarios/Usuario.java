package com.projeto.backup.codigo.usuarios;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Usuario {
    private String cpf;
    private String celular;
    private String nome;
    private String email;
    private int numeroLivro;
    private boolean suspensao;

    public Usuario(String cpf, String celular, String nome, String email) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = 1;
        this.suspensao = false;
    }

    public Usuario(String cpf, String celular, String nome, String email, int numeroLivro) {
        this.cpf = cpf;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
        this.numeroLivro = numeroLivro;
        this.suspensao = false;
    }

}