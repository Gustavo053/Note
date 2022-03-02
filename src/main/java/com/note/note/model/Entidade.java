package com.note.note.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class Entidade implements Serializable {
    private Boolean ativo;
    @CreatedDate
    private LocalDateTime dataCadastro;
    @LastModifiedDate
    private LocalDateTime dataAlteracao;
}
