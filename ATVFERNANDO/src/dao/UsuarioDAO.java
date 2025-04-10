package dao;

import java.io.*;
import java.util.*;
import model.Usuario;

public class UsuarioDAO {
    private final String arquivo = "usuarios.txt";

    public void salvar(Usuario usuario) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        writer.write(usuario.toString());
        writer.newLine();
        writer.close();
    }

    public List<Usuario> listar() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        File file = new File(arquivo);
        if (!file.exists()) return usuarios;

        BufferedReader reader = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] partes = linha.split(",");
            if (partes.length == 2) {
                usuarios.add(new Usuario(partes[0], partes[1]));
            }
        }
        reader.close();
        return usuarios;
    }
}
