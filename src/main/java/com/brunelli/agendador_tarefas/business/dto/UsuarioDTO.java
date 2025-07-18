package com.brunelli.agendador_tarefas.business.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UsuarioDTO {

    private String email;
    private String senha;


}
