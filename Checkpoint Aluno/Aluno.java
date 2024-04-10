package br.com.fiap;

// Henrique Pontes Oliveira - 98036
// Gustavo Kawamura Christofani - 99679

//importando para utilizar a dataDeNascimento
import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    private int rm;
    private String nome;
    private LocalDate dataDeNascimento;

    // Construtor vazio
    public Aluno() {
    }

    // Construtor com passagem de parâmetros
    public Aluno(int rm, String nome, LocalDate dataDeNascimento) {
        setRm(rm);
        this.nome = nome;
        setDataDeNascimento(dataDeNascimento);
    }

    // Getters e Setters
    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        if (rm >= 97001 && rm <= 551999) {
            this.rm = rm;
        } else {
            throw new IllegalArgumentException("RM deve ser entre 97001 e 551999.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        int anoAtual = LocalDate.now().getYear();
        if (dataDeNascimento.getYear() >= 1900 && dataDeNascimento.getYear() <= anoAtual) {
            this.dataDeNascimento = dataDeNascimento;
        } else {
            throw new IllegalArgumentException("Ano de nascimento deve ser entre 1900 e o ano atual.");
        }
    }

    // Método para calcular a idade completa
    public String calculaIdadeCompleta() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(this.dataDeNascimento, hoje);
        return String.format("%d anos, %d meses e %d dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
