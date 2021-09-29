package excecao.personalizada;

import collections.Usuario;

public class Validar {

    private Validar(){}

    public static void usuario(Usuario usuario){
        if(usuario == null)
            throw new IllegalArgumentException("Usuário vazio");
        if(usuario.nome == null || usuario.nome.trim().isEmpty())
            throw new StringVaziaException("nome");
        if(usuario.valor < 0)
            throw new NumeroNegativoException("valor");
    }
}
