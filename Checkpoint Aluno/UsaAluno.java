package br.com.fiap;

// Henrique Pontes Oliveira - 98036
// Gustavo Kawamura Christofani - 99679

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UsaAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Supondo que os valores dos dois primeiros alunos sejam fixos (exemplo)
        Aluno aluno1 = new Aluno(98036, "Henrique Pontes", LocalDate.parse("19/10/2004", formatter));
        Aluno aluno2 = new Aluno(97003, "Maria Oliveira", LocalDate.parse("22/08/1988", formatter));
        
        // Para os outros dois alunos, vamos pedir os dados ao usuário
        System.out.println("Digite o RM, nome e data de nascimento (dd/MM/yyyy) do 3º aluno:");
        int rm = scan.nextInt();
        scan.nextLine(); // Limpar buffer
        String nome = scan.nextLine();
        LocalDate dataNascimento = LocalDate.parse(scan.nextLine(), formatter);
        Aluno aluno3 = new Aluno(rm, nome, dataNascimento);
        
        System.out.println("Digite o RM, nome e data de nascimento (dd/MM/yyyy) do 4º aluno:");
        rm = scan.nextInt();
        scan.nextLine(); // Limpar buffer
        nome = scan.nextLine();
        dataNascimento = LocalDate.parse(scan.nextLine(), formatter);
        Aluno aluno4 = new Aluno(rm, nome, dataNascimento);
        
        // Exibindo informações dos alunos
        Aluno[] alunos = {aluno1, aluno2, aluno3, aluno4};
        for (Aluno aluno : alunos) {
            System.out.println("RM: " + aluno.getRm() + ", Nome: " + aluno.getNome() + ", Idade Completa: " + aluno.calculaIdadeCompleta());
        }
        
        scan.close();
    }
}
