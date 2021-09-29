package excecao.personalizada;

import collections.Usuario;

public class TesteValidações {
    public static void main(String[] args) {

        try {
            Usuario usuario = new Usuario("", -1);
            Validar.usuario(usuario);
        }catch (StringVaziaException ex){
            System.out.println(ex.getMessage());
        }catch (NumeroNegativoException ex){
            System.out.println(ex.getMessage());
        }

    }
}
