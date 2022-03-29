package com.projeto.backup.codigo.cadastros;


import com.projeto.backup.codigo.interfaces.Menus;
import com.projeto.backup.codigo.usuarios.Usuario;

public class CadastrarUsuario implements Menus.MenuCadastrarUsuario, Menus.DigitarDados{
    private Usuario usuario;

    @Override
    public void criacaoConta() {
        // TODO Auto-generated method stub
    }

    @Override
    public void digitarDados() {
            this.usuario = new Usuario(
            ColetarDados.coletaString("CPF: "),
            ColetarDados.coletaString("Celular: "),
            ColetarDados.coletaString("Nome: "),
            ColetarDados.coletaString("Email: "));
    }

}
