package Exerc14;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public String informaNome() {
        return nome;
    }
}
