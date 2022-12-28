package com.funcionario.cadrastro.repositorios;

import com.funcionario.cadrastro.Entity.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FuncionarioRepositorio extends  JpaRepository<Funcionarios, Long>{

}
