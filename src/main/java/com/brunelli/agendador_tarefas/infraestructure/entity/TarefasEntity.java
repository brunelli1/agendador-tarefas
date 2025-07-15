package com.brunelli.agendador_tarefas.infraestructure.entity;

import com.brunelli.agendador_tarefas.infraestructure.enums.StastusNotificacaoEnum;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("tarefa")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasEntity {

    @Id
    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataAlteracao;
    private StastusNotificacaoEnum stastusNotificacaoEnum;


}
