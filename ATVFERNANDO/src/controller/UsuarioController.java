package controller;

import view.UsuarioView;
import bo.UsuarioBO;
import model.Usuario;

public class UsuarioController {
    private UsuarioView view = new UsuarioView();
    private UsuarioBO bo = new UsuarioBO();

    public void adicionarUsuario() {
        try {
            Usuario usuario = view.lerUsuario();
            bo.adicionar(usuario);
            view.mostrarMensagem("Usuário salvo com sucesso!");
        } catch (Exception e) {
            view.mostrarMensagem("Erro: " + e.getMessage());
        }
    }
}
