package excecao.personalizada;

public class StringVaziaException extends RuntimeException {

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("Atributo %s vazio", nomeDoAtributo);
    }
}
