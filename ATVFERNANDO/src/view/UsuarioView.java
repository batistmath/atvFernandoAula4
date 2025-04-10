package view;

import java.util.Scanner;
import model.Usuario;

public class UsuarioView {
    private Scanner scanner = new Scanner(System.in);

    public Usuario lerUsuario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        return new Usuario(nome, email);
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }
}
