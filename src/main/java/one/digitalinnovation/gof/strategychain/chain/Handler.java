package one.digitalinnovation.gof.strategychain.chain;

import one.digitalinnovation.gof.model.Endereco;

public interface Handler {
        void setNext(Handler next);
        void handle(Endereco endereco);
}


