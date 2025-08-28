package one.digitalinnovation.gof.strategychain.chain;

import one.digitalinnovation.gof.model.Endereco;

public class CepExistenceHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Endereco endereco) {
        if (endereco.getLogradouro() == null || endereco.getLogradouro().isEmpty()) {
            throw new IllegalArgumentException("CEP não encontrado");
        }
        if (next != null) next.handle(endereco);
    }

}

