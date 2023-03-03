package br.com.training.processadorValidacaoJob.reader;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ProcessadorValidacaoReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader<Cliente> ProcessadorValidacaoReader(
            @Value("#{jobParameters['arquivoClientes']}")Resource arquivoClientes){
        return new FlatFileItemReaderBuilder<Cliente>()
                .name("ProcessadorValidacaoReader")
                .resource(arquivoClientes)
                .delimited()
                .names("nome", "idade", "email")
                .targetType(Cliente.class)
                .build();
    }
}
