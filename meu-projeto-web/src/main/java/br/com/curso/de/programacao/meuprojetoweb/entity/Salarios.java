package br.com.curso.de.programacao.meuprojetoweb.entity;

import java.math.BigDecimal;

// @Entity
// @Table(schema = "", name = "TB_SALARIOS")
public class Salarios {
    private BigDecimal meuSalarioDeProgramador = BigDecimal.ZERO;
    private BigDecimal meuSalarioDeStreamer = BigDecimal.ZERO;

    public Salarios() {
    }

    /**@Param meuSalarioDeProgramador salario de programador, <br>
     * @Param meuSalarioDeStreamer salario de streamer*/
    public Salarios(BigDecimal meuSalarioDeProgramador, BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }

    public Salarios(BigDecimal meuSalarioDeProgramador) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
    }

    public BigDecimal getMeuSalarioDeProgramador() {
        return meuSalarioDeProgramador;
    }

    public void setMeuSalarioDeProgramador(BigDecimal meuSalarioDeProgramador) {
        this.meuSalarioDeProgramador = meuSalarioDeProgramador;
    }

    public BigDecimal getMeuSalarioDeStreamer() {
        return meuSalarioDeStreamer;
    }

    public void setMeuSalarioDeStreamer(BigDecimal meuSalarioDeStreamer) {
        this.meuSalarioDeStreamer = meuSalarioDeStreamer;
    }

    @Override
    public String toString() {
        return "Salarios{" +
                "meuSalarioDeProgramador=" + meuSalarioDeProgramador +
                ", meuSalarioDeStreamer=" + meuSalarioDeStreamer +
                '}';
    }
}
