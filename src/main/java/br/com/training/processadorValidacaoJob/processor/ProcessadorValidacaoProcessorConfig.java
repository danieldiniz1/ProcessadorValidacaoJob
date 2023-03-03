package br.com.training.processadorValidacaoJob.processor;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorValidacaoProcessorConfig {

    @Bean
    public ItemProcessor<Cliente,Cliente> ProcessadorValidacaoProcessor(){
        //TODO implementar lógica de processamento aqui
        return cliente -> cliente;
    }
}
