package br.com.training.processadorValidacaoJob.writer;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorValidacaoWriterConfig {

    private static final Logger LOGGER = LogManager.getLogger();

    @Bean
    public ItemWriter<Cliente> ProcessadorValidacaoWriter(){
        return clientes -> clientes.forEach(cliente -> LOGGER.info(cliente));
    }
}
