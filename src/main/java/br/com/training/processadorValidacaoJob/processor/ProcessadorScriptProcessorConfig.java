package br.com.training.processadorValidacaoJob.processor;

import br.com.training.processadorValidacaoJob.model.Cliente;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.support.builder.ScriptItemProcessorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorScriptProcessorConfig {

    @Bean
    public ItemProcessor<Cliente,Cliente> processorScriptProcessor(){
        return new ScriptItemProcessorBuilder<Cliente,Cliente>()
                .language("nashorn")
                .scriptSource(
                        "var email = item.getEmail();" +
                        "var arquivoExiste = `ls | grep ${email}.txt `" +
                        "if (!arquivoExiste) item; else null")
                .build();
    }
}
