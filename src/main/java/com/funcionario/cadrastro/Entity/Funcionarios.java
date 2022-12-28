package com.funcionario.cadrastro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Value;
import org.hibernate.internal.util.StringHelper;

import java.util.Date;

@Entity
@Table (name = "TAB_FUNCIONARIO")
@Data
public class Funcionarios {
    @Id
    private Long id;
    @Column(name="CARGO")
    private String cargo;
    @Column(name="DATA_INICIO")
    private Date dataInicio;
    @Column(name="MATRICULA")
    private Long matricula;
}
