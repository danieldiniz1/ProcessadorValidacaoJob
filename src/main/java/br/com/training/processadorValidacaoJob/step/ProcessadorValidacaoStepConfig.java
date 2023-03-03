package br.com.training.processadorValidacaoJob.step;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ProcessadorValidacaoStepConfig {

    @Bean
    public Step processadorValidacaoStep(ItemReader<Cliente> processadorValidacaoReader,
                                         ItemProcessor<Cliente, Cliente> processadorValidacaoProcessor,
                                         ItemWriter<Cliente> processadorValidacaoWriter,
                                         JobRepository jobRepository,
                                         PlatformTransactionManager transactionManager){
        return new StepBuilder("processadorValidacaoStep",jobRepository)
                .<Cliente,Cliente> chunk(1,transactionManager)
                .reader(processadorValidacaoReader)
                .processor(processadorValidacaoProcessor)
                .writer(processadorValidacaoWriter)
                .build();
    }
}
