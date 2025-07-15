package com.brunelli.agendador_tarefas.business;

import com.brunelli.agendador_tarefas.business.dto.TarefasDTO;
import com.brunelli.agendador_tarefas.business.mapper.TarefasConverter;
import com.brunelli.agendador_tarefas.infraestructure.entity.TarefasEntity;
import com.brunelli.agendador_tarefas.infraestructure.enums.StastusNotificacaoEnum;
import com.brunelli.agendador_tarefas.infraestructure.repository.TarefasRepository;
import com.brunelli.agendador_tarefas.infraestructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));

        dto.setDataCriacao(LocalDateTime.now());
        dto.setStastusNotificacaoEnum(StastusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaEntity(dto);

        return tarefaConverter.paraTarefadto(
                tarefasRepository.save(entity)
        );
    }

}
