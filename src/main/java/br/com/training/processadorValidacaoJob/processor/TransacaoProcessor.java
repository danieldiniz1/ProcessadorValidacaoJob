package br.com.training.processadorValidacaoJob.processor;

import br.com.training.processadorValidacaoJob.model.Transacao;
import org.springframework.batch.item.ItemProcessor;

public class TransacaoProcessor implements ItemProcessor<Transacao,Transacao> {

    @Override
    public Transacao process(Transacao item) throws Exception {
        return null;
    }
}
