package br.com.curso.de.programacao.meuprojetoweb.controller;

import br.com.curso.de.programacao.meuprojetoweb.entity.Salarios;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;

@Controller
public class GeradorDeSalarios {
    public BigDecimal salarioProgramador(){
        Salarios salariosProgramador = new Salarios();
        salariosProgramador.setMeuSalarioDeProgramador(new BigDecimal("10.00"));
        return salariosProgramador.getMeuSalarioDeProgramador();
    }

    public Salarios todosSalarios(){
        Salarios salarios = new Salarios(new BigDecimal("10.00"), new BigDecimal("20.00"));
        return salarios;
    }
}
