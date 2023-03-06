package br.com.training.processadorValidacaoJob.processor;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.springframework.batch.item.ItemProcessor;

public class ClienteProcessor implements ItemProcessor<Cliente,Cliente> {

    @Override
    public Cliente process(Cliente item) throws Exception {
        return null;
    }
}
