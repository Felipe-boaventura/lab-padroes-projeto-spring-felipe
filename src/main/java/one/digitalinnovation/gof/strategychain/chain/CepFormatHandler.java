package one.digitalinnovation.gof.strategychain.chain;

import one.digitalinnovation.gof.model.Endereco;

public class CepFormatHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Endereco endereco) {
        if (!endereco.getCep().matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP inválido");
        }
        if (next != null) next.handle(endereco);
    }

}
