package bo;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioBO {
    private UsuarioDAO dao = new UsuarioDAO();

    public void adicionar(Usuario usuario) throws Exception {
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty()) {
            throw new Exception("Nome e email não podem estar vazios.");
        }
        if (!usuario.getEmail().contains("@")) {
            throw new Exception("Email inválido.");
        }
        dao.salvar(usuario);
    }
}
