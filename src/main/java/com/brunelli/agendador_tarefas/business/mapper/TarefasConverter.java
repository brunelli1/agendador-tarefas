package com.brunelli.agendador_tarefas.business.mapper;

import com.brunelli.agendador_tarefas.business.dto.TarefasDTO;
import com.brunelli.agendador_tarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefadto(TarefasEntity entity);
}
