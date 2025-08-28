package one.digitalinnovation.gof.strategychain.chain;

import one.digitalinnovation.gof.model.Endereco;

public class LoggingHandler implements Handler{
    @Override
    public void setNext(Handler next) {

    }

    @Override
    public void handle(Endereco endereco) {
        System.out.println("Endereço validado: " + endereco.getCep());

    }
}
