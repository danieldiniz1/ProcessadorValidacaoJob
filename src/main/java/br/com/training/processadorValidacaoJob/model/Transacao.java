package br.com.training.processadorValidacaoJob.model;

import lombok.Data;

@Data
public class Transacao {

    private String id;
    private String descricao;
    private String valor;
}
