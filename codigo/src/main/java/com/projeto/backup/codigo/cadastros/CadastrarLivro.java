package com.projeto.backup.codigo.cadastros;

import com.projeto.backup.codigo.emprestimo.Livro;
import com.projeto.backup.codigo.interfaces.Menus;

public class CadastrarLivro implements Menus.MenuCadastrarLivro, Menus.DigitarDados {
    private Livro livro;

    @Override
    public void criacaoLivro() {
        // TODO
    }

    @Override
    public void digitarDados() {
        this.livro = new Livro(
                ColetarDados.coletaString("Nome: "),
                ColetarDados.coletaInteger("Ano: ", -2000, 2022),
                ColetarDados.coletaString("Autor: "),
                ColetarDados.coletaString("Editora: "));

    }

}
