package br.com.training.processadorValidacaoJob.processor;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.ClassifierCompositeItemProcessor;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemProcessorBuilder;
import org.springframework.classify.Classifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorClassifierProcessorConfig {

    @Bean
    public ItemProcessor processadorClassifierProcessor() {

        return new ClassifierCompositeItemProcessorBuilder<>()
                .classifier(classifier())
                .build();
    }

    private Classifier classifier() {
        return new Classifier<Object,ItemProcessor>() {
            @Override
            public ItemProcessor classify(Object object) {
                if (object instanceof Cliente)
                    return new ClienteProcessor();
                else {
                    return new TransacaoProcessor();
                }

            }
        };
    }
}
