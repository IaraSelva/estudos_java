package excecao.personalizada;

public class NumeroNegativoException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("Atributo %s negativo", nomeDoAtributo);
    }
}
